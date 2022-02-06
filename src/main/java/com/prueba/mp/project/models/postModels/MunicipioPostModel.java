package com.prueba.mp.project.models.postModels;

public class MunicipioPostModel {
    private String descripcion;
    private Long departamento_id;

    public String getDescripcion() {
        return descripcion;
    }

    public Long getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Long departamento_id) {
        this.departamento_id = departamento_id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
