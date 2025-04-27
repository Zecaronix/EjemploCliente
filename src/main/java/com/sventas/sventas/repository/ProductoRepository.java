package com.sventas.sventas.repository;

import com.sventas.sventas.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Producto.
 * Extiende JpaRepository para proporcionar métodos CRUD y de acceso a datos.
 *
 * @see com.sventas.sventas.model.Producto
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}