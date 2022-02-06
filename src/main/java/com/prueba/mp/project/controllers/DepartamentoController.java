
package com.prueba.mp.project.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.mp.project.models.DepartamentoModel;
import com.prueba.mp.project.services.DepartamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;

    @GetMapping()
    public ArrayList<DepartamentoModel> getAll() {
        return this.departamentoService.getAll();
    }

    @PostMapping
    public DepartamentoModel postAndUpdate(@RequestBody DepartamentoModel departamento) {
        return this.departamentoService.postAndUpdate(departamento);
    }

    @GetMapping(path = "/{id}")
    public Optional<DepartamentoModel> getById(@PathVariable("id") Long id) {
        return this.departamentoService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.departamentoService.deleteById(id);
        return ok ? "Departamento eliminado" : "No se pudo eliminar la Departamento";
    }
}
