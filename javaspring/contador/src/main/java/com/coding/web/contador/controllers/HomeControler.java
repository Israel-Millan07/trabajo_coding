package com.coding.web.contador.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		int contador;
		if (session.getAttribute("contador")==null) {
			contador = 0;
		}else {
			contador = (int) session.getAttribute("contador");
		}
		contador = contador + 1;
		session.setAttribute("contador",contador);
		
		System.out.println("estoy home");	
		
		
		return "home.jsp";		
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session,Model model) {
		int contador = (int) session.getAttribute("contador");
		model.addAttribute("contador",contador);
		model.addAttribute("nombre","Leo");
		
		return "contador.jsp";
		
	}
	
}

