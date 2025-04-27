package com.sventas.sventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity that represents a product in the database.
 */
@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idProducto;

  @Column(name = "nombre", nullable = false, length = 100)
  private String nombre;

  @Column(name = "descripcion", nullable = true, length = 255)
  private String descripcion;

  @Column(name = "precio", nullable = false)
  private Double precio;

  @Column(name = "stock", nullable = false)
  private Integer stock;
}