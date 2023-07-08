package com.example.philips.devweek.Controller;

import com.example.philips.devweek.Entity.Regiao;
import com.example.philips.devweek.Repository.RegiaoRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class ControllerRegiao {

    private final RegiaoRepo repository;

    public ControllerRegiao(RegiaoRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/regiao")
    public List<Regiao> getRegiao(){
       return repository.findAll();
    }

    @GetMapping("/regiao/{id}")
    public ResponseEntity<?> getRegiaoById(@PathVariable Long id){

      Optional regiaoEsolhidaOptional = repository.findById(id);

      if(regiaoEsolhidaOptional.isPresent()){

            Object regiaoEscolhida = regiaoEsolhidaOptional.get();
            return new ResponseEntity<>(regiaoEscolhida, HttpStatus.OK);

      }

      return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping("/regiao/novo")
    public void postRegiao(Regiao newRegiao){

        repository.save(newRegiao);
        //2
    }

}
