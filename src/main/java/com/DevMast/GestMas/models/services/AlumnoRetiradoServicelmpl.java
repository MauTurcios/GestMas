package com.DevMast.GestMas.models.services;

import java.util.List; 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DevMast.GestMas.models.entities.AlumnoRetirado;
import com.DevMast.GestMas.models.repository.alumnoretiradoRepository;

@Service
public class AlumnoRetiradoServicelmpl implements AlumnoRetiradoService {
	
	@Autowired
	public alumnoretiradoRepository repository;

	@Override
	public List<AlumnoRetirado> findAll() {
		return (List<AlumnoRetirado>)repository.findAll();
	}

	@Override
	public AlumnoRetirado save(AlumnoRetirado entity) {
		return  repository.save(entity);
	}

	@Override
	public Optional<AlumnoRetirado> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
	

}
