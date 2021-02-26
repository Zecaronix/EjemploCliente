package com.sventas.sventas.controller.request;

public class ClienteRequest {

    private Integer idCliente;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;

    private String email;

    private Integer idPuesto;
    private String nompuesto;
    private String descripcion;

    private Integer idsueldo;
    private Integer importe;

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
