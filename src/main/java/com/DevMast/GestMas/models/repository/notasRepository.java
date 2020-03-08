package com.DevMast.GestMas.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.DevMast.GestMas.models.entities.Notas;

@Repository
public interface notasRepository extends CrudRepository<Notas, Long> {

}