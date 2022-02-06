
package com.prueba.mp.project.repositories;

import com.prueba.mp.project.models.MunicipioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends CrudRepository<MunicipioModel, Long> {
}