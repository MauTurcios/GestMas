package com.DevMast.GestMas.models.controller;

import java.util.List; 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.DevMast.GestMas.models.entities.Alumnos;
import com.DevMast.GestMas.models.services.AlumnoService;

@RestController
@RequestMapping("alumnos")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	
	
	@RequestMapping(value="/alumno", method = RequestMethod.GET)
	public List<Alumnos> obtenerAlumnos(){
		List<Alumnos> alumnos = alumnoService.findAll();
		return alumnos;
	}
	
	@RequestMapping(value="/alumno/{id}", method = RequestMethod.GET)
	public Alumnos obtenerById(@PathVariable("id") Long id) {
		Optional<Alumnos> alumnosById = alumnoService.findById(id);
		return alumnosById.get();
	}
	
	@RequestMapping(value="/alumno", method = RequestMethod.POST)
	public Alumnos guardar(@RequestBody Alumnos alumnos) {
		Alumnos matriculado = alumnoService.save(alumnos);
		return matriculado;
	}
	
	@RequestMapping(value="/alumno/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id) {
		alumnoService.delete(id);
	}

}
