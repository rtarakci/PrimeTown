package com.example.demo.modell;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
//import org.apache.commons.math3.primes;

@Entity
public class primeTown {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    private String Owner;
    private int yearOfConstruction;
    private int number;

    public primeTown(){}

    public primeTown(String owner, int yoc){

        this.Owner = owner;
        this.yearOfConstruction = yoc;
  //      this.number = Primes.nextPrime();
 }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
