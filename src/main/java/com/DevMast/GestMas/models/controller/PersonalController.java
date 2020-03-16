package com.DevMast.GestMas.models.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.DevMast.GestMas.models.entities.Personal;
import com.DevMast.GestMas.models.services.PersonalService;

@RestController
@RequestMapping("personaldoc")
public class PersonalController {

	@Autowired
	private PersonalService personalService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Personal> obtenerPersonal() {
		List<Personal> personal = personalService.findAll();
		return personal;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Personal> obtenerById(@PathVariable("id") Long id) {
		Optional<Personal> personalById = personalService.findById(id);
		return personalById;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Personal guardar(@RequestBody Personal personal) {
		Personal doc = personalService.save(personal);
		return doc;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		personalService.delete(id);
	}

}
