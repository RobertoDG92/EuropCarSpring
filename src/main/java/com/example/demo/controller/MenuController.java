package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="Menu")
public class MenuController {
	@GetMapping(value="/Lista")
	public ModelAndView lista() {
		ModelAndView model = new ModelAndView("menu/Lista");
		return model;
	}
}
