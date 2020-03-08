package com.DevMast.GestMas.models.services;

import java.util.List; 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DevMast.GestMas.models.entities.Alumnos;
import com.DevMast.GestMas.models.repository.alumnosRepository;

@Service
public class AlumnosService implements AlumnoService {
	
	@Autowired
	public alumnosRepository repository;

	@Override
	public List<Alumnos> findAll() {
		return (List<Alumnos>)repository.findAll();
	}

	@Override
	public Alumnos save(Alumnos entity) {
		return  repository.save(entity);
	}

	@Override
	public Optional<Alumnos> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
	

}
