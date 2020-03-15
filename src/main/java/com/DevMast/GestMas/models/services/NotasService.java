package com.DevMast.GestMas.models.services;

import java.util.List;
import java.util.Optional;
import com.DevMast.GestMas.models.entities.Notas;

public interface NotasService {
	
	public List<Notas> findAll();
	
	public Notas save (Notas entity);
	
	public Optional<Notas> findById(Long id);

	public void delete(Long id);
}
