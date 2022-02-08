
package com.prueba.mp.project.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.mp.project.models.MunicipioModel;
import com.prueba.mp.project.models.postModels.MunicipioPostModel;
import com.prueba.mp.project.services.DepartamentoService;
import com.prueba.mp.project.services.MunicipioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/municipio")
public class MunicipioController {
    @Autowired
    MunicipioService municipioService;

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping()
    public ArrayList<MunicipioModel> getAll() {
        return this.municipioService.getAll();
    }

    @PostMapping()
    public MunicipioModel postAndUpdate(@RequestBody MunicipioPostModel municipioPost) {
        return this.municipioService.postAndUpdate(municipioPost);
    }

    @GetMapping(path = "/{id}")
    public Optional<MunicipioModel> getById(@PathVariable("id") Long id) {
        return this.municipioService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.municipioService.deleteById(id);
        return ok ? "Departamento eliminado" : "No se pudo eliminar la Departamento";
    }
}
