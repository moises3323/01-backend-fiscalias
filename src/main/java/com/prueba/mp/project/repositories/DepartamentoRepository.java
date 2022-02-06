
package com.prueba.mp.project.repositories;

import com.prueba.mp.project.models.DepartamentoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends CrudRepository<DepartamentoModel, Long> {
}