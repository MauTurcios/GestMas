package com.DevMast.GestMas.models.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.DevMast.GestMas.models.entities.Usuarios;
import com.DevMast.GestMas.models.services.UsuariosService;

@RestController
@RequestMapping ("Usuarios")

public class UsuariosController {
	
	@Autowired
	private UsuariosService usuariosService;
	
	@RequestMapping(value="/usuarios", method = RequestMethod.GET)
	public List<Usuarios> obtenerUsuarios(){
		List<Usuarios> usuarios = usuariosService.findAll();
		return usuarios;
	}
	
	@RequestMapping (value="/usuarios/{id}", method =RequestMethod.GET)
	public Optional<Usuarios> obtenerById(@PathVariable("id")Long id) {
		Optional<Usuarios> usuariosById = usuariosService.findById(id);
		return usuariosById;
	}
	
	@RequestMapping(value="/usuarios", method = RequestMethod.POST)
	public Usuarios guardar(@RequestBody Usuarios usuarios) {
		Usuarios usuario = usuariosService.save(usuarios);
		return usuario;
	}
	
	@RequestMapping (value="/usuarios/{id}", method = RequestMethod.DELETE)
	public void delete (@PathVariable("id") Long id) {
		usuariosService.delete(id);
	}

}
