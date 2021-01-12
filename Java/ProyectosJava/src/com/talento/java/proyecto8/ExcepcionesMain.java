package com.talento.java.proyecto8;

import java.util.ArrayList;

public class ExcepcionesMain {
	public static void main(String[] args) {
			// Creando mi arreglo
			ArrayList<Object> myList = new ArrayList<Object>();
			myList.add("13");
			myList.add(48);
			myList.add("14");
			myList.add("15");		
			myList.add(33);
			

			//instancia de la clase
			ExcepcionesEjercicios ee = new ExcepcionesEjercicios();
			//llamando o usando el metodo o funcion
			ee.manejoExcepciones(myList);
		}
}
