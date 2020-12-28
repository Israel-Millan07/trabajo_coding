package com.talento.java.proyecto1;

public class Pitagoras {

	public static void main(String[] args) {
		System.out.println(calcularHipotenusa(3,4));
	}
	
	 public static double calcularHipotenusa(int catetoA, int catetoB) {
	        //La hipotenusa es el lado opuesto del ángulo recto.
	        //Calcular el valor de c dados los valores catetoA y catetoB
		 double hipo = Math.sqrt(Math.pow(catetoA,2)+ Math.pow(catetoB,2));
		 return hipo;
	    }
}
