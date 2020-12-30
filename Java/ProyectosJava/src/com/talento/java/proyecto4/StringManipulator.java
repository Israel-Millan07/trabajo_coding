package com.talento.java.proyecto4;

public class StringManipulator {
	 public  String stringManipulator(){
		String hola = (" Hola ".trim().concat(" Mundo"));

		char letter = 'n';
		int a =("Coding".indexOf(letter));
		int b =("Hola Mundo".indexOf(letter));
		int c = ("Saludar".indexOf(letter));
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1	
		
			
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int X = (word.indexOf(subString) );
		int Y = (word.indexOf(notSubString));
		System.out.println(X); // 2
		System.out.println(Y); // -1
		
		String con = ("Hola".substring(1, 3).concat( "mundo"));
		System.out.println(con); // olmundo
		
		return hola+","+String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+","+String.valueOf(X)+","+String.valueOf(Y)+","+con;
		
	}
	}
