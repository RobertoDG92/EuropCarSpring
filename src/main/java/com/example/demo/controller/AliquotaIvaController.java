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

import com.example.demo.model.AliquotaIva;
import com.example.demo.service.AliquotaIvaService;

@Controller
@RequestMapping(value="/AliquotaIva")
public class AliquotaIvaController {

	@Autowired
	AliquotaIvaService aliser;
	
	@GetMapping(value="/ListaAliquote")
	public ModelAndView listaAliquote() {
		ModelAndView model = new ModelAndView();
		List<AliquotaIva> listaAliquote = aliser.getAllAliquote();
		model.addObject("elencoAliquote", listaAliquote);
		model.setViewName("AliquotaIva/ListaAliquote");
		return model;
	}
	

	@GetMapping(value="/AddAliquota")
	public ModelAndView addAliquota() {
		ModelAndView model = new ModelAndView();
		AliquotaIva oAliquota = new AliquotaIva();
		model.addObject("oggettoAliquota", oAliquota);
		model.setViewName("AliquotaIva/AddEditAliquotaIva");
		return model;
	}
	@GetMapping(value="/EditAliquota/{id}")
	public ModelAndView editAliquota(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView();
		AliquotaIva oAliquota = aliser.getAliquotaById(id);
		model.addObject("oggettoAliquota", oAliquota);
		model.setViewName("AliquotaIva/AddEditAliquotaIva");
		return model;
		
	}
	@PostMapping(value="SaveAliquota")
	public ModelAndView saveAliquota(@Valid @ModelAttribute("oggettoAliquota") AliquotaIva oAliquota, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("AliquotaIva/AddEditAliquotaIva");
			return model;
				
		} else {
			aliser.saveOrUpdate(oAliquota);
			return new ModelAndView("redirect:/AliquotaIva/ListaAliquote");
		}
	}
	
	@GetMapping(value="DeleteAliquota/{id}") 
	public ModelAndView deleteArea(@PathVariable("id") Integer id) {
		aliser.deleteAliquota(id);
	return new ModelAndView("redirect:/AliquotaIva/ListaAliquote");
	
	}
}
