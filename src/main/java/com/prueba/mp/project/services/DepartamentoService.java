package com.prueba.mp.project.services;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.mp.project.models.DepartamentoModel;
import com.prueba.mp.project.repositories.DepartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;

    public ArrayList<DepartamentoModel> getAll() {
        return (ArrayList<DepartamentoModel>) this.departamentoRepository.findAll();
    }

    public DepartamentoModel postAndUpdate(DepartamentoModel Departamento) {
        return this.departamentoRepository.save(Departamento);
    }

    public Optional<DepartamentoModel> getById(Long id) {
        return this.departamentoRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        try {
            this.departamentoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}