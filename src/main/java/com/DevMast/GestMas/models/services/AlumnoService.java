package com.DevMast.GestMas.models.services;

import java.util.List;
import java.util.Optional;
import com.DevMast.GestMas.models.entities.Alumnos;

public interface AlumnoService {
	
	public List<Alumnos> findAll();
	
	public Alumnos save (Alumnos entity);
	
	public Optional<Alumnos> findById(Long id);
	
	public void delete (Long id);
	
}
