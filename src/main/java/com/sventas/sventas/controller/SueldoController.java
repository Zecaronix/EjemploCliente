package com.sventas.sventas.controller;


import com.sventas.sventas.model.Sueldo;
import com.sventas.sventas.service.impl.SueldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sueldos")
public class SueldoController {

    @Autowired
    SueldoService sueldoService;

    @GetMapping
    public ResponseEntity<List<Sueldo>> findAll() {
        return new ResponseEntity<>(sueldoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Sueldo> create(@RequestBody Sueldo sueldo){
        return new ResponseEntity<>(sueldoService.create(sueldo), HttpStatus.CREATED);
    }
}
