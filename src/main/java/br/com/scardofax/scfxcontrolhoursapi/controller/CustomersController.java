package br.com.scardofax.scfxcontrolhoursapi.controller;

import br.com.scardofax.scfxcontrolhoursapi.model.Customers;
import br.com.scardofax.scfxcontrolhoursapi.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    private CustomersRepository customersRepository;

    @GetMapping
    public List<Customers> findCustomers(){
        return customersRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Customers> create(@Valid @RequestBody Customers customers){
        return ResponseEntity.status(HttpStatus.CREATED).body(customersRepository.save(customers));

    }


}
