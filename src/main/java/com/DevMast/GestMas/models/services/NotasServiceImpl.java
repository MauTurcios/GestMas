package com.DevMast.GestMas.models.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DevMast.GestMas.models.entities.Notas;
import com.DevMast.GestMas.models.repository.notasRepository;

@Service
public class NotasServiceImpl implements NotasService {

	@Autowired
	public notasRepository repository;

	@Override
	public List<Notas> findAll() {
		return (List<Notas>) repository.findAll();
	}

	@Override
	public Notas save(Notas entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Notas> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}
}
