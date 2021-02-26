package com.sventas.sventas.service;

import com.sventas.sventas.model.Sueldo;

import java.util.List;

public interface ISueldoService {
    Sueldo create(Sueldo sueldo);
    List<Sueldo> findAll();
    void delete(Integer idSueldo);

}
