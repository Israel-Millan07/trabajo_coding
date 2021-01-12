package com.talento.java.proyecto8;

import java.util.ArrayList;

public class ExcepcionesEjercicios {
public void manejoExcepciones(ArrayList<Object> myList) {
		
		for(int i = 0; i < myList.size(); i++) {
			try {
				 int castedValue = (int) myList.get(i);//(tipoDato) -> castear o convertir a
				 System.out.println(castedValue);
			} catch (Exception e) {
				System.out.println("mensaje de error: "+e);
			}
		   
		}
	}

}
