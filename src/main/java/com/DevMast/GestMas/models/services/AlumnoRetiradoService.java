package com.DevMast.GestMas.models.services;

import java.util.List;
import java.util.Optional;
import com.DevMast.GestMas.models.entities.AlumnoRetirado;

public interface AlumnoRetiradoService {

	public List<AlumnoRetirado> findAll();

	public AlumnoRetirado save(AlumnoRetirado entity);

	public Optional<AlumnoRetirado> findById(Long id);

	public void delete(Long id);

}