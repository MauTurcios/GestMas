package com.DevMast.GestMas.models.services;

import java.util.List; 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DevMast.GestMas.models.entities.Usuarios;
import com.DevMast.GestMas.models.repository.usuariosRepository;

@Service
public class UsuariosServiceImpl implements UsuariosService {
	
	@Autowired
	public usuariosRepository repository;

	@Override
	public List<Usuarios> findAll() {
		return (List<Usuarios>)repository.findAll();
	}

	@Override
	public Usuarios save(Usuarios entity) {
		return  repository.save(entity);
	}

	@Override
	public Optional<Usuarios> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
	
