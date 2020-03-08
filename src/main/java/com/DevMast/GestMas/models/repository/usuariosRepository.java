package com.DevMast.GestMas.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.DevMast.GestMas.models.entities.Usuarios;

@Repository
public interface usuariosRepository extends CrudRepository<Usuarios, Long> {

}