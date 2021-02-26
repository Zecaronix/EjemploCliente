package com.sventas.sventas.model;

import javax.persistence.*;

@Entity//anotacion o tag + siempre va entity xq de esa manera se vera reflejado en la BD
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//tag para autoincrementables
    private Integer idCliente;

    @Column(name = "nombres", nullable = true, length = 70)
    private String nombres;

    @Column(name = "apellidos", nullable = true, length = 70)
    private String apellidos;

    @Column(name = "direccion", nullable = true, length = 150)
    private String direccion;

    @Column(name = "telefono", nullable = true, length = 9)
    private String telefono;

    @Column(name = "email", nullable = false)
    private String email;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
