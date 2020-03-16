package com.DevMast.GestMas.models.services;

import java.util.List;
import java.util.Optional;
import com.DevMast.GestMas.models.entities.Usuarios;

public interface UsuariosService {

	public List<Usuarios> findAll();

	public Usuarios save(Usuarios entity);

	public Optional<Usuarios> findById(Long id);

	public void delete(Long id);
}
