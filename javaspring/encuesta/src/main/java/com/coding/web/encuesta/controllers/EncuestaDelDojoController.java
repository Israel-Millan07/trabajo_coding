package com.coding.web.encuesta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EncuestaDelDojoController {

	@RequestMapping("/")
	public String formulario() {
		System.out.println("aca tu formulario");


		return "/formulario.jsp";

	}
	@RequestMapping(value="/resultado", method=RequestMethod.POST)
	public String resultado(@RequestParam(value="username") String username ,Model model) {
		model.addAttribute("username",username);

		return "/resultado.jsp"; 
	}
}
