package com.talento.java.zool�gico;

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
		System.out.println("satisfacci�n del gorila");
	}
	public void climb() {
		this.energyLevel= this.energyLevel -10;
		System.out.println("El gorila ha trepado a la cima de un �rbol");
	}
}
