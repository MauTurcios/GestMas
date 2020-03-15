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
import com.DevMast.GestMas.models.entities.Asistencia;
import com.DevMast.GestMas.models.services.AsistenciaService;


@RestController
@RequestMapping ("asistencia")
public class AsistenciaController {
	
	@Autowired
	private AsistenciaService asistenciaService;
	
	@RequestMapping(value="/alumno-asistencia", method = RequestMethod.GET)
	public List<Asistencia> obtenerAsistencia(){
		List<Asistencia> asistencia = asistenciaService.findAll();
		return asistencia;
	}
	
	@RequestMapping(value="/alumno-asistencia/{id}", method = RequestMethod.GET)
	public Optional<Asistencia> obtenerById(@PathVariable("id")Long id) {
		Optional<Asistencia> asistenciaById = asistenciaService.findById(id);
		return asistenciaById;
	}
	
	@RequestMapping(value="/alumno-asistencia", method = RequestMethod.POST)
	public Asistencia guardar(@RequestBody Asistencia notas) {
		Asistencia asistio = asistenciaService.save(notas);
		return asistio;
	}
		
}
