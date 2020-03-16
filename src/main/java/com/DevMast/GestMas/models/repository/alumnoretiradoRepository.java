package com.DevMast.GestMas.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DevMast.GestMas.models.entities.AlumnoRetirado;

@Repository
public interface alumnoretiradoRepository extends CrudRepository<AlumnoRetirado, Long> {

}