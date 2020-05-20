package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.lang.Math;
import java.util.Calendar;
@Service
public class HelperClass {

    public boolean validateYOC(int x){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (x > 1800 && x < year){
            return true;

        }
        else {
            return false;
        }
    }

//    public long getNextPrime(){

  //  }
}
