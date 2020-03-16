package com.DevMast.GestMas.models.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DevMast.GestMas.models.entities.Personal;
import com.DevMast.GestMas.models.repository.personalRepository;;

@Service
public class PersonalServiceImpl implements PersonalService {

	@Autowired
	public personalRepository repository;

	@Override
	public List<Personal> findAll() {
		return (List<Personal>) repository.findAll();
	}

	@Override
	public Personal save(Personal entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Personal> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
