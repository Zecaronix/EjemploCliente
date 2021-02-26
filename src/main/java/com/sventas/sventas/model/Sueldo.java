package com.sventas.sventas.model;

import javax.persistence.*;

@Entity
@Table(name = "Sueldo")
public class Sueldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsueldo;

    @Column(name = "importe", nullable = true, length = 70)
    private Integer importe;

    public Integer getIdsueldo() {
        return idsueldo;
    }

    public void setIdsueldo(Integer idsueldo) {
        this.idsueldo = idsueldo;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }
}
