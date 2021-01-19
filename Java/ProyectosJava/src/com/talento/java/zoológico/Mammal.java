package com.talento.java.zoológico;

public class Mammal {
	protected Integer energyLevel = 100;
	public  Integer displayEnergy() {
		System.out.println("nivel de energia: "+this.energyLevel);
		return this.energyLevel;
	}
}
