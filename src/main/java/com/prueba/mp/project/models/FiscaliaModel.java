package com.prueba.mp.project.models;

import javax.persistence.*;

@Entity
@Table(name = "fiscalia")
public class FiscaliaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private String direccion;
    private Integer estado;
    private String nombre;

    @ManyToOne
    private DepartamentoModel departamento;

    @ManyToOne
    private MunicipioModel municipio;

    public Long getid() {
        return id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
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

    public void setid(Long id) {
        this.id = id;
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

    public DepartamentoModel getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoModel departamento) {
        this.departamento = departamento;
    }

    public MunicipioModel getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioModel municipio) {
        this.municipio = municipio;
    }
}
