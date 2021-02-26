package com.sventas.sventas.controller;

import com.sventas.sventas.controller.request.ClienteRequest;
import com.sventas.sventas.exception.ModelNotFoundException;
import com.sventas.sventas.model.Cliente;
import com.sventas.sventas.service.impl.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//la clase en la que expones tu servicio-te muestra la informacion por post,get,put,delete
@RequestMapping("/clientes")//alli se indica el nombre del controlador
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable("id") Integer idCliente){
        Cliente cliente=clienteService.findById(idCliente);
        if(cliente == null){
            throw new ModelNotFoundException("Cliente no encontrado");
        }
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @PostMapping//crear
    public ResponseEntity<String> create(@RequestBody ClienteRequest clienteRequest){//requestbody para usarlo con 'body' en postman
        return new ResponseEntity<>(clienteService.create(clienteRequest), HttpStatus.CREATED);
    }

    @PutMapping//actualizar
    public ResponseEntity<Object> update(@RequestBody Cliente cliente){
        clienteService.update(cliente);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")//borra
    public ResponseEntity<Object> delete(@PathVariable("id") Integer idCliente) throws Exception {

        Cliente cliente=clienteService.findById(idCliente);
        if(cliente == null){
            throw new ModelNotFoundException("El Cliente que desea eliminar no existe");
        }
        clienteService.delete(idCliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
