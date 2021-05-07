package com.lgImovel.lgImovel.controller;

import com.lgImovel.lgImovel.model.Localidade;
import com.lgImovel.lgImovel.service.LocalidadeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/localidade")

public class LocalidadeController {
    private final LocalidadeService localidadeService;


    public LocalidadeController( LocalidadeService localidadeService ) {
        this.localidadeService = localidadeService;
    }

   @GetMapping
    public ResponseEntity <List<Localidade>> findAll(){
        return new ResponseEntity<>(this.localidadeService.findAll(), HttpStatus.OK);
   }

   @GetMapping ("/{id}")
    public ResponseEntity <Localidade> findById( @PathVariable Long id){
        return new ResponseEntity<>(localidadeService.findById(id), HttpStatus.OK);
   }

   @PostMapping
    public ResponseEntity <Localidade> create (@RequestBody Localidade localidade){
        return new ResponseEntity<>(localidadeService.create(localidade), HttpStatus.CREATED);
   }

   @PutMapping ("/{id}")
    public ResponseEntity <Localidade> update (@PathVariable Long id, @RequestBody Localidade localidade){
        localidade = this.localidadeService.findById(id);
        return new ResponseEntity<>(this.localidadeService.update(localidade), HttpStatus.OK);
   }

   @DeleteMapping ("/{id}")
    public ResponseEntity <String> delete (@PathVariable Long id){
        this.localidadeService.delete(id);
        return new ResponseEntity<>("Deletedo com êxito", HttpStatus.OK);
   }
}
