package com.talento.java.maestrodelobjeto2;

import com.talento.java.maestrodelobjeto1.Human;

public class Ninja extends Human {
	public Ninja() {
		super(3,10,3,100);
	}
	
	public void steal(Human vistima) {
		/*Ninja: Agregar un método steal(Human) que roba 
		la cantidad de puntos que tenga el Ninja en stealth 
		de la salud del otro Human 
		y los agrega a la health del Ninja.*/
		
		//robando al health de la victima, lo que el ninja tenga en Stealth
		vistima.setHealth(vistima.getHealth() - this.getStealth());
		
		//sumando Stealth al Health del ninja
		this.setHealth(this.getHealth()+ this.getStealth());
		

		
	}
	//Agregar un método runAway() que reduce su salud en 10.
	public void runAway() {
		setHealth(getHealth()-10);
	}
}
