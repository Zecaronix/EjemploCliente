package com.sventas.sventas.service.impl;

import com.sventas.sventas.controller.request.ClienteRequest;
import com.sventas.sventas.model.Cliente;
import com.sventas.sventas.model.Puesto;
import com.sventas.sventas.model.Sueldo;
import com.sventas.sventas.repository.IClienteRepository;
import com.sventas.sventas.service.ISaveClienteTotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveClienteTotal implements ISaveClienteTotal {

    @Autowired  //inyectar
    private IClienteRepository implClienteService;

    @Autowired  //inyectar
    private PuestoService implPuestoService;

    @Autowired  //inyectar
    private SueldoService implSueldoService;

    @Override
    public String saveAll(ClienteRequest clienteRequest) {

        String mensaje = "Se guardo correctamente";

        Cliente cliente = new Cliente(); // instanciar

        cliente.setNombres(clienteRequest.getNombres());
        cliente.setApellidos(clienteRequest.getApellidos());
        cliente.setTelefono(clienteRequest.getTelefono());
        cliente.setEmail(clienteRequest.getEmail());
        cliente.setDireccion(clienteRequest.getDireccion());
        implClienteService.save(cliente);

        Puesto puesto = new Puesto();   // instanciar

        puesto.setIdPuesto(clienteRequest.getIdPuesto());
        puesto.setNompuesto(clienteRequest.getNompuesto());
        puesto.setDescripcion(clienteRequest.getDescripcion());
        implPuestoService.create(puesto);

        Sueldo sueldo = new Sueldo();   // instanciar
        sueldo.setIdsueldo(clienteRequest.getIdsueldo());
        sueldo.setImporte(clienteRequest.getImporte());
        implSueldoService.create(sueldo);

        return mensaje;
    }

}
