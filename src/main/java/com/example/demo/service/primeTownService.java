package com.example.demo.service;

import com.example.demo.modell.primeTown;
import com.example.demo.repo.primeTownRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class primeTownService {
    private final primeTownRepo pTRepo;

    public primeTownService(primeTownRepo pTRepo) {
        this.pTRepo = pTRepo;
    }

    public primeTown save(primeTown pr){

        return pTRepo.save(pr);
    }

    public primeTown update(primeTown pr, Long id){
            pr.setId(id);
            return pTRepo.save(pr);
    }

    public void delete(primeTown pr){
        pTRepo.delete(pr);
    }
    public Optional<primeTown> getPrimeTown(Long id) throws Exception {
        try {
            return pTRepo.findById(id);
        }catch (Exception e){
            throw new Exception("Kein Objekt gefunden");
        }
    }

    public void delete(Long id) throws Exception {
         primeTown pr = this.getPrimeTown(id).orElseThrow(Exception::new);

        pTRepo.delete(pr);
    }

    public Iterable<primeTown> getAllPrimeTown(){
        return pTRepo.findAll();
    }
}
