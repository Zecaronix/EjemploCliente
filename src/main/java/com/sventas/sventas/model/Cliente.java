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
public class Cliente {

  /**
   * Unique identifier for the product.
   * This field is automatically generated using the IDENTITY strategy.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idProducto;

  /**
   * Name of the product.
   * This field is mandatory and has a maximum length of 100 characters.
   */
  @Column(name = "nombre", nullable = false, length = 100)
  private String nombre;

  /**
   * Description of the product.
   * This field is optional and has a maximum length of 255 characters.
   */
  @Column(name = "descripcion", nullable = true, length = 255)
  private String descripcion;

  /**
   * Price of the product.
   * This field is mandatory.
   */
  @Column(name = "precio", nullable = false)
  private Double precio;

  /**
   * Stock quantity of the product.
   * This field is mandatory.
   */
  @Column(name = "stock", nullable = false)
  private Integer stock;
}