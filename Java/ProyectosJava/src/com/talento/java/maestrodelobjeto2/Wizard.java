package com.talento.java.maestrodelobjeto2;

import com.talento.java.maestrodelobjeto1.Human;

public class Wizard extends Human{

		public Wizard() {
			super(3,3,8, 50);
			// TODO Auto-generated constructor stub
		}

		public void heal(Human sanado) {
			sanado.setHealth(sanado.getHealth()+this.getIntelligence());
		}
		public void fireBall(Human humanito) {
			humanito.setHealth(humanito.getHealth()-(this.getIntelligence()*3));
		}
	}
