package com.sventas.sventas.service;

import com.sventas.sventas.controller.request.ClienteRequest;
import com.sventas.sventas.model.Cliente;

import java.util.List;

public interface IClienteService {//indicas los metodos a usar y que voy a hacer con ellos

    String create(ClienteRequest clienteRequest);//el metodo create regresa un string a partir de clientrequest

    Cliente update(Cliente cliente);

    Cliente findById(Integer id);

    List<Cliente> findAll();//el metodo findall retorna una lista de clientes

    void delete(Integer id);
}
