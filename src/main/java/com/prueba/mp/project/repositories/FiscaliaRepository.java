
package com.prueba.mp.project.repositories;

import com.prueba.mp.project.models.FiscaliaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscaliaRepository extends CrudRepository<FiscaliaModel, Long> {
}