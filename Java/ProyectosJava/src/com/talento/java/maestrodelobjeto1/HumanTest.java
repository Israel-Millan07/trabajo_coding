package com.talento.java.maestrodelobjeto1;

import com.talento.java.maestrodelobjeto2.Ninja;
import com.talento.java.maestrodelobjeto2.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		Human wizard  = new Human();
		Human ninja = new Human();
		Human samurai = new Human();
		
		//wizard atacado por ninja
		wizard.attack(ninja);
		wizard.attack(ninja);
		wizard.attack(ninja);
		System.out.println("Health Wizard: "+wizard.getHealth());
		
		Wizard wiz  = new Wizard();
		System.out.println(wiz.getIntelligence());

		Ninja atakador = new Ninja();
		System.out.println("Stealth:"+atakador.getStealth());
		
		wizard.attack(atakador);
		System.out.println("Health:"+wiz.getHealth());
		
		atakador.steal(wiz);
		System.out.println("Health ninja: "+atakador.getHealth());
		wiz.fireBall(atakador);
		
		System.out.println("Healt del ninja: "+atakador.getHealth());
		
		samurai.attack(wizard);

	}

}
