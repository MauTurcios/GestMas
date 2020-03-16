package com.DevMast.GestMas.models.services;

import java.util.List;
import java.util.Optional;
import com.DevMast.GestMas.models.entities.Personal;

public interface PersonalService {

	public List<Personal> findAll();

	public Personal save(Personal entity);

	public Optional<Personal> findById(Long id);

	public void delete(Long id);
}
