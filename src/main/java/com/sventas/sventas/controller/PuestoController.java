package com.sventas.sventas.controller;

import com.sventas.sventas.model.Puesto;
import com.sventas.sventas.service.impl.PuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("puestos")
public class PuestoController {

    @Autowired
    private PuestoService puestoService;

    @GetMapping
    public ResponseEntity<List<Puesto>> findAll() {
        return new ResponseEntity<>(puestoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Puesto> create(@RequestBody Puesto puesto){
        return new ResponseEntity<>(puestoService.create(puesto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{idPuesto}")
    public ResponseEntity<Object> delete(@PathVariable("idPuesto") Integer idPuesto)  {

        puestoService.delete(idPuesto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
