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

import com.example.demo.model.AnnoContabile;
import com.example.demo.model.AreaInvestimento;
import com.example.demo.service.AnnoContabileService;
import com.example.demo.service.AreaInvestimentoService;

@Controller
@RequestMapping(value="/AreaInv")
public class AreaInvController {

		@Autowired
		AreaInvestimentoService oareaser;
		
		@Autowired
		AnnoContabileService annoser; 
		
		
		@GetMapping(value="/ListaAree")
		public ModelAndView listaAree() {
			ModelAndView model = new ModelAndView();
			List<AreaInvestimento> listaAree = oareaser.getAllAreeInv();
			model.addObject("elencoAree", listaAree);
			model.setViewName("AreaInv/ListaAree");
			return model;
		}
		
		@GetMapping(value="/AddArea")
		public ModelAndView addArea() {
			ModelAndView model = new ModelAndView();
			AreaInvestimento oArea = new AreaInvestimento();
			List<AnnoContabile> listaAnni = annoser.getAllAnni();
			model.addObject("elencoAnniContabili", listaAnni);
			model.addObject("oggettoArea", oArea);
			model.setViewName("AreaInv/AddEditArea");
			return model;
		}
		
		@GetMapping(value="/EditArea/{id}")
		public ModelAndView editArea(@PathVariable("id") Integer id) {
			ModelAndView model = new ModelAndView();
			AreaInvestimento oArea = oareaser.getAreaInvById(id);
			List<AnnoContabile> listaAnni = annoser.getAllAnni();
			model.addObject("elencoAnniContabili", listaAnni);
			model.addObject("oggettoArea", oArea);
			model.setViewName("AreaInv/AddEditArea");
			return model;
		}
		
		@PostMapping(value="SaveArea")
		public ModelAndView saveArea(@Valid @ModelAttribute("oggettoArea") AreaInvestimento oArea, BindingResult bindingresult) {
			if (bindingresult.hasErrors()) {
				ModelAndView model = new ModelAndView();
				model.setViewName("AreaInv/AddEditArea");
				return model;
					
			} else {
				oareaser.saveOrUpdate(oArea);
				return new ModelAndView("redirect:/AreaInv/ListaAree");
			}
		}
		
		@GetMapping(value="DeleteArea/{id}") 
		public ModelAndView deleteArea(@PathVariable("id") Integer id) {
		oareaser.deleteArea(id);
		return new ModelAndView("redirect:/AreaInv/ListaAree");
		
		}
}
