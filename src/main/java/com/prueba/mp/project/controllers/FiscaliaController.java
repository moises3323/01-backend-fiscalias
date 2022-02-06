
package com.prueba.mp.project.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.mp.project.models.FiscaliaModel;
import com.prueba.mp.project.models.postModels.FiscaliaPostModel;
import com.prueba.mp.project.services.FiscaliaService;

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
@RequestMapping("/fiscalia")
public class FiscaliaController {
    @Autowired
    FiscaliaService fiscaliaService;

    @GetMapping()
    public ArrayList<FiscaliaModel> getAll() {
        return this.fiscaliaService.getAll();
    }

    @PostMapping
    public FiscaliaModel postAndUpdate(@RequestBody FiscaliaPostModel fiscalia) {
        return this.fiscaliaService.postAndUpdate(fiscalia);
    }

    @GetMapping(path = "/{id}")
    public Optional<FiscaliaModel> getById(@PathVariable("id") Long id) {
        return this.fiscaliaService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.fiscaliaService.deleteById(id);
        return ok ? "Fiscalia eliminada" : "No se pudo eliminar la Fiscalia";
    }
}
