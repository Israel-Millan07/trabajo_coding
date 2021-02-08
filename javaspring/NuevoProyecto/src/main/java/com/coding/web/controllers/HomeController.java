package com.coding.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("entrando a home");
		return "index.jsp";
	}
	@RequestMapping("/otro/metodo")
	public String ruta2() {
		return "index.jsp";
	}

}
