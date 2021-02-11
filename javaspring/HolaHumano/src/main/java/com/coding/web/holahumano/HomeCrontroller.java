package com.coding.web.holahumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCrontroller {
	@RequestMapping ("/")
	public String index(@RequestParam(value="nombre", required=false) String searchQuery) {
		if(searchQuery ==null) {
			return "¡Hola Humano!";
		}else {
			return "¡Hola "+ searchQuery+"!";
		}
	}
}
