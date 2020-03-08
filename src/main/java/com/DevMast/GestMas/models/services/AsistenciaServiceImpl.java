package com.DevMast.GestMas.models.services;

import java.util.List; 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DevMast.GestMas.models.entities.Asistencia;
import com.DevMast.GestMas.models.repository.asistenciaRepository;

@Service
public class AsistenciaServiceImpl implements AsistenciaService {
	
	@Autowired
	public asistenciaRepository repository;
	
	@Override
	public List<Asistencia> findAll() {
		return (List<Asistencia>)repository.findAll();
	}

	@Override
	public Asistencia save(Asistencia entity) {
		return  repository.save(entity);
	}

	@Override
	public Optional<Asistencia> findById(Long id) {
		return repository.findById(id);
	}
	
}
