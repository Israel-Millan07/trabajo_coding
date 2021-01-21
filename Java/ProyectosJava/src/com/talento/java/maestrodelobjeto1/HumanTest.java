package com.talento.java.maestrodelobjeto1;

public class HumanTest {

	public static void main(String[] args) {
		Human wizard  = new Human();
		Human ninja = new Human();
//		Human samurai = new Human();
		
		//wizard atacado por ninja
		wizard.attack(ninja);
		wizard.attack(ninja);
		wizard.attack(ninja);
		System.out.println("Health Wizard: "+wizard.getHealth());

//		wizard.heal(ninja);
//		System.out.println(ninja.getHealth());
//		
//		ninja.attack(wizard);
//		
	}

}
