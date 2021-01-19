package com.talento.java.zoológico2;

import com.talento.java.zoológico.Mammal;
public class Bat extends Mammal {
	public Bat(Integer energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
		super.energyLevel=300;
		

	}
	public void fly(){
		this.energyLevel = this.energyLevel -50;
		System.out.println("el sonido que hace el Bat al despegar ");
		
	}
	
	public void eatHumans() {
		this.energyLevel = this.energyLevel +25;
		System.out.println("bueno, no importa");
	}
	
	public void attackTown(){
		this.energyLevel = this.energyLevel -100;
		System.out.println("el sonido de la ciudad en llamas");
	}

	
}
