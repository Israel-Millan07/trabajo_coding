package com.talento.java.maestrodelobjeto2;

import com.talento.java.maestrodelobjeto1.Human;

public class Samurai extends Human{
	public Samurai() {
		super(3,3,3,200);
	}
public void deathBlow (Human mortal) {
	mortal.setHealth(mortal.getHealth()-this.getHealth());
	
}
public void  meditate(Samurai meditar) {
	meditar.setHealth(meditar.getHealth()+(this.getHealth()/2));
	
}
public void howMany(Samurai cuanto) {
	System.out.println(Samurai.this.getHealth()+""+Samurai.this.getIntelligence()+""+Samurai.this.getStrength());
}
}
