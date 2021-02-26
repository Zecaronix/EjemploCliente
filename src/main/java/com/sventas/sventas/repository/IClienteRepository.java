package com.sventas.sventas.repository;

import com.sventas.sventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
//para usarlo de modo declarativo, solo declaras lo que vas a hacer(ejmp> con la libreria de JPA)+clase+tipo de variable
    //de la PK de la clase
}
