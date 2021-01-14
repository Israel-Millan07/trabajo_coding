package com.talento.java.ensayo;

public class MainOOP {

	public static void main(String[] args) {
		MiObjeto objeto = new MiObjeto();
		String retorno = objeto.greet();
		
		System.out.println(retorno);
		
		String retorno2 = objeto.greet("Coding", "Ninja");
		System.out.println(retorno2);
		Integer num = 7;
		String retorno3 = objeto.greet(num);
		System.out.println(retorno3);
		//private
		objeto.otraFuncion();
		
		Integer ret = objeto.funcionInteger();
		
		objeto.funcionDos();
		
	}

}
