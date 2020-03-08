package com.DevMast.GestMas.models.services;

import java.util.List;
import java.util.Optional;
import com.DevMast.GestMas.models.entities.Asistencia;

public interface AsistenciaService {
	
	public List<Asistencia> findAll();
	
	public Asistencia save(Asistencia entity);
	
	public Optional<Asistencia> findById(Long id);
	
}
