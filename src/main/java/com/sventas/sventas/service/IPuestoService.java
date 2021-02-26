package com.sventas.sventas.service;


import com.sventas.sventas.model.Puesto;

import java.util.List;

public interface IPuestoService {

    Puesto create(Puesto puesto);

    List<Puesto> findAll();

    void delete(Integer idPuesto);
}
