package com.DevMast.GestMas.models.controller;

import java.util.List; 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.DevMast.GestMas.models.entities.AlumnoRetirado;
import com.DevMast.GestMas.models.services.AlumnoRetiradoService;

@RestController
@RequestMapping("alumnosretirado")
public class AlumnoRetiradoController {
	
	@Autowired
	private AlumnoRetiradoService alumnoretiradoService;
	
	
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<AlumnoRetirado> obtenerAlumnos(){
		List<AlumnoRetirado> alumnoretirado = alumnoretiradoService.findAll();
		return alumnoretirado;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public AlumnoRetirado obtenerById(@PathVariable("id") Long id) {
		Optional<AlumnoRetirado> alumnosById = alumnoretiradoService.findById(id);
		return alumnosById.get();
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public AlumnoRetirado guardar(@RequestBody AlumnoRetirado alumnoretirado) {
		AlumnoRetirado retirado = alumnoretiradoService.save(alumnoretirado);
		return retirado;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id) {
		alumnoretiradoService.delete(id);
	}

}
