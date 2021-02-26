package com.sventas.sventas.model;

import javax.persistence.*;

@Entity
@Table(name="puesto")
public class Puesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpuesto", nullable = true, length = 70)
    private Integer idPuesto;

    @Column(name = "nompuesto", nullable = true, length = 70)
    private String nompuesto;

    @Column(name = "descripcion", nullable = true, length = 70)
    private String descripcion;

    public Integer getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNompuesto() {
        return nompuesto;
    }

    public void setNompuesto(String nompuesto) {
        this.nompuesto = nompuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
