package com.prueba.mp.project.services;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.mp.project.models.DepartamentoModel;
import com.prueba.mp.project.models.FiscaliaModel;
import com.prueba.mp.project.models.MunicipioModel;
import com.prueba.mp.project.models.postModels.FiscaliaPostModel;
import com.prueba.mp.project.repositories.DepartamentoRepository;
import com.prueba.mp.project.repositories.FiscaliaRepository;
import com.prueba.mp.project.repositories.MunicipioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FiscaliaService {
    @Autowired
    FiscaliaRepository fiscaliaRepository;

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Autowired
    MunicipioRepository municipioRepository;

    public ArrayList<FiscaliaModel> getAll() {
        return (ArrayList<FiscaliaModel>) fiscaliaRepository.findAll();
    }

    public FiscaliaModel postAndUpdate(FiscaliaPostModel fiscalia) {

        FiscaliaModel fiscaliaModel = new FiscaliaModel();

        fiscaliaModel.setid(fiscalia.getId());
        fiscaliaModel.setNombre(fiscalia.getNombre());
        fiscaliaModel.setDescripcion(fiscalia.getDescripcion());
        fiscaliaModel.setDireccion(fiscalia.getDireccion());
        fiscaliaModel.setEstado(fiscalia.getEstado());

        DepartamentoModel departamentoModel = departamentoRepository.findById(fiscalia.getDepartamento_id())
                .map(depto -> {
                    return depto;
                }).orElseThrow();

        MunicipioModel municipioModel = municipioRepository.findById(fiscalia.getMunicipio_id())
                .map(muni -> {
                    return muni;
                }).orElseThrow();

        fiscaliaModel.setDepartamento(departamentoModel);
        fiscaliaModel.setMunicipio(municipioModel);

        return fiscaliaRepository.save(fiscaliaModel);
    }

    public Optional<FiscaliaModel> getById(Long id) {
        return fiscaliaRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        try {
            fiscaliaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}