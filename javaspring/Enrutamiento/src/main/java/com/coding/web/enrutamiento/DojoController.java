package com.coding.web.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{track}")
	public String dojo(@PathVariable("track") String track) {
		if(track.equals("dojo")) {
			return "¡El Dojo es increíble!";
		}else if(track.equals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		}else if(track.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		return "";
	}
}
