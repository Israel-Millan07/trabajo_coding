package com.coding.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorPersonas {
	@RequestMapping("/persona")
	public String validarPersona() {
		System.out.println("Validando persona");
	
		return "persona.jsp";
	}
	
	@RequestMapping("/persona/variable")
	public String miFuncion(Model model) {
		//esto nos permite enviar datoa a la vista(model model)
		model.addAttribute("isra",2021);
		model.addAttribute("mensaje","nuevo mensaje para ti");
		return "persona.jsp";
	}

	//redireccionamiento a otra url
		@RequestMapping("/persona/llamado")
		public String llamado(){

			return "redirect:/otro/metodo";
		}


}
