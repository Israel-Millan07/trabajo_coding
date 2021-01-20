package com.talento.java.zoológico;

public class Gorilla extends Mammal{
	
	public Gorilla(Integer energyLevel) {
		super(energyLevel);
		super.energyLevel=100;
	}
	public  void throwSomething() {
		this.energyLevel = this.energyLevel -5;
		System.out.println("El gorila ha lanzado algo");
	}
	public void eatBananas() {
		this.energyLevel =this.energyLevel + 10;
		System.out.println("satisfacción del gorila");
	}
	public void climb() {
		this.energyLevel= this.energyLevel -10;
		System.out.println("El gorila ha trepado a la cima de un árbol");
	}
}
