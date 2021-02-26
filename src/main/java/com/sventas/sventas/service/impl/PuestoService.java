package com.sventas.sventas.service.impl;

import com.sventas.sventas.model.Puesto;
import com.sventas.sventas.repository.IPuestoRepository;
import com.sventas.sventas.service.IPuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuestoService implements IPuestoService {

    @Autowired
    private IPuestoRepository puestoRepo;

    @Override
    public Puesto create(Puesto puesto) {
        return puestoRepo.save(puesto);
    }

    @Override
    public List<Puesto> findAll() {
        return puestoRepo.findAll();
    }

    @Override
    public void delete(Integer idPuesto) {
        puestoRepo.deleteById(idPuesto);
    }
}
