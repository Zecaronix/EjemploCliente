package com.sventas.sventas.repository;

import com.sventas.sventas.model.Sueldo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISueldoRepository extends JpaRepository <Sueldo, Integer> {
}
