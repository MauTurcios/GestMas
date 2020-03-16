package com.DevMast.GestMas.models.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.DevMast.GestMas.models.entities.Notas;
import com.DevMast.GestMas.models.services.NotasService;

@RestController
@RequestMapping("notas")

public class NotasController {

	@Autowired
	private NotasService notasService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Notas> obtenerNotas() {
		List<Notas> notas = notasService.findAll();
		return notas;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Notas> obtenerById(@PathVariable("id") Long id) {
		Optional<Notas> notasById = notasService.findById(id);
		return notasById;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Notas guardar(@RequestBody Notas notas) {
		Notas nota = notasService.save(notas);
		return nota;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		notasService.delete(id);
	}

}
