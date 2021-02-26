package com.sventas.sventas.service.impl;

import com.sventas.sventas.controller.request.ClienteRequest;
import com.sventas.sventas.model.Cliente;
import com.sventas.sventas.model.Puesto;
import com.sventas.sventas.model.Sueldo;
import com.sventas.sventas.repository.IClienteRepository;
import com.sventas.sventas.repository.IPuestoRepository;
import com.sventas.sventas.service.IClienteService;
import com.sventas.sventas.service.IPuestoService;
import com.sventas.sventas.service.ISueldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired//para inyectar lo deseado
    private IClienteRepository clienteRepo;//para poder usar los metodos del JPArepository

    @Autowired
    private SaveClienteTotal saveClienteTotal;

    @Override//sobrescribe los metodos de la interfaz que estoy implementando
    public String create(ClienteRequest clienteRequest) {//public: para poder usar en cualquier parte

        try{//como un if
            saveClienteTotal.saveAll(clienteRequest);//el metodo saveAll retorna el servicio saveClienteTotal a partir del clienteRequest

            return "Se guardo Correctamente";
        }catch (Exception e){//else
            System.out.println(e);
            return "Ubo un error al guardar  . . .";
        }

    }


    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        Optional<Cliente> clienteOptional = clienteRepo.findById(id);
        return clienteOptional.orElse(null);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        clienteRepo.deleteById(id);
    }
}
