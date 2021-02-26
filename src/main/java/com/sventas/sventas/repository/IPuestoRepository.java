package com.sventas.sventas.repository;

import com.sventas.sventas.model.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPuestoRepository extends JpaRepository<Puesto, Integer> {
}
