package com.example.demo.controller;

import com.example.demo.modell.primeTown;
import com.example.demo.service.primeTownService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class primeTownController {
    private final primeTownService pTService;

    public primeTownController(primeTownService pTS) {
        this.pTService = pTS;
    }
    @GetMapping("/primeTown")
    public Iterable<primeTown> getallStudent(){
        return pTService.getAllPrimeTown();
    }
    @GetMapping("/primeTown/{id}")
    public Optional<primeTown> getPrimeTown(@PathVariable Long id){
        try {
            return pTService.getPrimeTown(id);
        } catch (Exception e) {
        return null;
        }
    }
    @PostMapping("/primeTown")
    public primeTown createPrimeTown(@RequestBody primeTown pr){
        return pTService.save(pr);
    }
    @PutMapping("/primeTown/{id}")
    public primeTown updatePrimeTown(@RequestBody primeTown pr, @PathVariable Long Id){
        return pTService.update(pr, Id);
    }
    @DeleteMapping("/primeTown/{id}")
    public void deletePrimeTown(@PathVariable Long id){
        try {
            pTService.delete(id);
        }catch (Exception e){

        }
    }
}
