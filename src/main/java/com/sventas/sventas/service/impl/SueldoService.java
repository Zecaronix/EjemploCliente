package com.sventas.sventas.service.impl;

import com.sventas.sventas.model.Sueldo;
import com.sventas.sventas.repository.ISueldoRepository;
import com.sventas.sventas.service.ISueldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SueldoService implements ISueldoService {

    @Autowired
    public ISueldoRepository sueldoRepo;

    @Override
    public Sueldo create(Sueldo sueldo) {
        return sueldoRepo.save(sueldo);
    }

    @Override
    public List<Sueldo> findAll() {
        return sueldoRepo.findAll();
    }

    @Override
    public void delete(Integer idSueldo) {
        sueldoRepo.deleteById(idSueldo);
    }
}
