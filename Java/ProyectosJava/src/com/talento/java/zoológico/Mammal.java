package com.talento.java.zool�gico;

public class Mammal {
	public Integer energyLevel;
	public  Integer displayEnergy() {
		System.out.println("nivel de energia: "+this.energyLevel);
		return this.energyLevel;
	}
	public Mammal(Integer energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}
}

