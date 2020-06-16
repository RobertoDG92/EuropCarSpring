package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Azienda;
import com.example.demo.model.Gruppo;
import com.example.demo.service.AziendaService;
import com.example.demo.service.GruppoService;

@Controller
@RequestMapping(value="/Azienda")
public class AziendaController {

	@Autowired
	AziendaService aziendaservice;
	
	@Autowired
	GruppoService grupposervice;
	
	@GetMapping(value="/ListaAziende")
	public ModelAndView listaAziende() {
		ModelAndView model = new ModelAndView();
		List<Azienda> listaAzienda = aziendaservice.getAllAziende();
		model.addObject("elencoAziende", listaAzienda);
		model.setViewName("Azienda/ListaAziende");
		return model;
	}
	
	
	@GetMapping(value="/AddAzienda")
	public ModelAndView addAzienda() {
		ModelAndView model = new ModelAndView();
		Azienda oAzienda = new Azienda();
		List<Gruppo> listaGruppi = grupposervice.getAllGruppi();
		model.addObject("elencoGruppi", listaGruppi);
		model.addObject("oggettoArea", oAzienda);
		model.setViewName("Azienda/AddEditAzienda");
		return model;
	}
	@GetMapping(value="/EditAzienda/{id}")
	public ModelAndView editAzienda(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView();
		Azienda oAzienda = aziendaservice.getAziendaById(id);
		List<Gruppo> listaGruppi = grupposervice.getAllGruppi();
		model.addObject("elencoGruppi", listaGruppi);
		model.addObject("oggettoArea", oAzienda);
		model.setViewName("Azienda/AddEditAzienda");
		return model;
		
	}
	@PostMapping(value="SaveAzienda")
	public ModelAndView saveAzienda(@Valid @ModelAttribute("oggettoAzienda") Azienda oAzienda, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("Azienda/AddEditAzienda");
			return model;
				
		} else {
			aziendaservice.saveOrUpdate(oAzienda);
			return new ModelAndView("redirect:/Azienda/ListaAziende");
		}
	}
	
	@GetMapping(value="DeleteAzienda/{id}") 
	public ModelAndView deleteArea(@PathVariable("id") Integer id) {
	aziendaservice.deleteAzienda(id);
	return new ModelAndView("redirect:/Azienda/ListaAziende");
	
	}
}
