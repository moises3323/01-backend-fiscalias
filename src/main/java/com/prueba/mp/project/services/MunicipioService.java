package com.prueba.mp.project.services;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.mp.project.models.MunicipioModel;
import com.prueba.mp.project.models.postModels.MunicipioPostModel;
import com.prueba.mp.project.repositories.DepartamentoRepository;
import com.prueba.mp.project.repositories.MunicipioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService {
    @Autowired
    MunicipioRepository municipioRepository;

    @Autowired
    DepartamentoRepository departamentoRepository;

    public ArrayList<MunicipioModel> getAll() {
        return (ArrayList<MunicipioModel>) this.municipioRepository.findAll();
    }

    public MunicipioModel postAndUpdate(MunicipioPostModel municipioPost) {
        MunicipioModel municipioModel = new MunicipioModel();
        municipioModel.setDescripcion(municipioPost.getDescripcion());

        return departamentoRepository.findById(municipioPost.getDepartamento_id()).map(departamento -> {
            municipioModel.setDepartamento(departamento);
            return this.municipioRepository.save(municipioModel);
        }).orElseThrow();
    }

    public Optional<MunicipioModel> getById(Long id) {
        return this.municipioRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        try {
            this.municipioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}