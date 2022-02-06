package com.prueba.mp.project.models.postModels;

public class FiscaliaPostModel {

    private String descripcion;
    private String direccion;
    private Integer estado;
    private String nombre;
    private Long departamento_id;
    private Long municipio_id;
    private Long id;

    public Integer getEstado() {
        return estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMunicipio_id() {
        return municipio_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Long getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Long departamento_id) {
        this.departamento_id = departamento_id;
    }

    public void setMunicipio_id(Long municipio_id) {
        this.municipio_id = municipio_id;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
