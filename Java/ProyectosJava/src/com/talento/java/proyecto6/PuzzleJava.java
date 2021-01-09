package com.talento.java.proyecto6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {
    void puzzle() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        numeros.add(2);
        numeros.add(7);
        numeros.add(9);
        numeros.add(8);
        numeros.add(13);
        numeros.add(25);
        numeros.add(32);
//        Collections.shuffle(numeros);
//        System.out.println(numeros); // [5, 4, 3, 2, 1]
//        Collections.sort(numeros);
//        System.out.println(numeros); // [1, 2, 3, 4, 5]
//                
//        Random r = new Random();
//        System.out.println(r.nextInt()); // Sin límites
//        System.out.println(r.nextInt(5)); // Con límites entre 0 y 5
        int sum=0;
        ArrayList<Integer> nuevo = new ArrayList<Integer>();
        for(int i=0 ;i<=numeros.size();i++) {
        	sum=numeros.get(i)+sum;
        	if(numeros.get(i)>10) {
        		nuevo.add(numeros.get(i));
        		
        	}
        }
        System.out.println(sum);
        System.out.println(nuevo.toString());

    }
//     Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi,
//     Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona. Haga que el método
//     también devuelva un arreglo
//     con los nombres que tienes más de 5 caracteres.
     ArrayList<String> nombres() {
    	 ArrayList<String> name = new ArrayList<String>(); 
    	 ArrayList<String> newname = new ArrayList<String>(); 
    	 name.add("Nancy");
    	 name.add("Jinichi");
    	 name.add("Fujibayashi");
    	 name.add("Momochi");
    	 name.add("Ishikawa");
    	 Collections.shuffle(name);
    	 System.out.println(name);
    	 for(int i=0; i<=4; i++) {
    		 if(name.get(i).length()>5) {
    			 newname.add(name.get(i));
    		 }
    	 }
    	 System.out.println(newname);
    	 return newname;
     }
//     Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). 
//     Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. También debe imprimir 
//     la primera letra del arreglo. Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
//     Para mezclar una colección, puede utilizar el método shuffle de la clase Collections. Documentación de la Clase Collections.
     
     void alfabeto() {    	
    	
    	 ArrayList<Character> letras = new ArrayList<Character>();  
    	 for (int i=0; i<26;i++) {
    		 char c = (char) (i + 'a');// convertir un nro a letra (castear) un dato al tipo char
    		 letras.add(c);
    		 
    	 }
    	 Collections.shuffle(letras);
    	 System.out.println(letras);
    	 System.out.println(letras.get(letras.size()-1));//tamaño del ArrayList
    	 if(letras.get(0)== 'a'|| letras.get(0)== 'e' ||letras.get(0)== 'i' ||letras.get(0)=='o' ||letras.get(0)=='u' ) {
    		 System.out.println("Vocal");
    	 }
     }
     
//     Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
//     Para obtener un número entero aleatorio, puede utilizar el método nextInt de la clase Random. Documentación de la Clase Random.
     
     
     
     void numAl () {
    	 ArrayList<Integer> numerosal = new ArrayList<Integer>(); 
    	//Random r = new Random();
    	
    	 for (int i=0; i<=9;i++) {
    		// int c = (int) (r.nextInt(55,100)+1 );
    		//int valor_aleatorio= (int) ((Math.random() * 100)+1) ;//generar valores,  nro aleatorios entre el 1 el 55
    		 int c = ThreadLocalRandom.current().nextInt(55, 100 + 1);
    		 numerosal.add(c);
    	 
    	 }System.out.println(numerosal);
     }
     
     
     
     
     
//     Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y hacer que estén ordenados 
//     (mostrar el número más pequeño en el principio del arreglo). 
     //Imprimir todos los números del arreglo. 
//     Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.
//     Para ordenar una colección, puede utilizar el método sort de la clase Collections.
     
     
     ArrayList<Integer> numAleatorios () {
    	 ArrayList<Integer> numerosal = new ArrayList<Integer>(); 
    	//Random r = new Random();
    
    	 for (int i=0; i<=9;i++) {
    		// int c = (int) (r.nextInt(55,100)+1 );
    		 int c = ThreadLocalRandom.current().nextInt(55, 100 + 1);
    		 numerosal.add(c);
    		 //Collections.sort(numerosal);
    	 }
    	 Collections.sort(numerosal);
    	 //desde el main
    	 System.out.println(numerosal);
    	 System.out.println (numerosal.get(0) );
    	 System.out.println (numerosal.get(9));
    	 return numerosal;
     }
     
     
     
     
     
     
   // Crear una cadena aleatoria con 5 caracteres de longitud.
//     

     void alfalog (){
    	 ArrayList<Character> abecedario = new ArrayList<Character>();  
    	 for (int i=0; i<26;i++) {
    		 char c = (char) (i + 'a');// convertir un nro a letra (castear) un dato al tipo char
    		 abecedario.add(c);
    		 
    	 }
    	 String cadena = "";
    	 for(int i=0; i<5; i++){
    		 int numerorandom = (int) (Math.random() * 26);
    		 cadena = cadena + abecedario.get(numerorandom);
    	 }
    	 System.out.println(cadena);// ejemplo ""+"z"+"y"+"r"+"y"+"e";
     }
     
     String cadenas(){
    	 ArrayList<Character> abecedario = new ArrayList<Character>();  
    	 for (int i=0; i<26;i++) {
    		 char c = (char) (i + 'a');// convertir un nro a letra (castear) un dato al tipo char
    		 abecedario.add(c);
    		 
    	 }
    	 String cadena = "";
    	 for(int i=0; i<5; i++){
    		 int numerorandom = (int) (Math.random() * 26);
    		 cadena = cadena + abecedario.get(numerorandom);
    	 }
    	 System.out.println(cadena);// ejemplo ""+"z"+"y"+"r"+"y"+"e";
    	 return cadena;
     }
     
//     public static String[] generateRandomWords(int numberOfWords){
//		 String[] randomStrings = new String[numberOfWords];
//		 Random random = new Random();
//		        return null;
//
//     for(int i = 0; i <=numberOfWords; i++)
//     {
//         char[] word = new char[random.nextInt(8)+3]; 
//         for(int j = 0; j < word.length; j++)
//         {
//             word[j] = (char)('a' + random.nextInt(26));
//         }
//        randomStrings = (String) new String(word);
//     }
//	System.out.println(randomStrings);	
//}
    

    	     
     //Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.
     void llamado() {
    	 ArrayList<String> listaCadenas= new ArrayList<String>();
    	 //for ( int 
    	 listaCadenas.add(cadenas());
     }
     
     
     
//     ArrayList<String>cadenas() {
//    	 ArrayList<Character> letras = new ArrayList<Character>(); 
//    	 ArrayList<String> vocales = new ArrayList<String>();
//    	 ArrayList<Character> palabras = new ArrayList<Character>();
//    	 
//    	 Random r = new Random();
//    	 letras.add('r');
//		 letras.add('o');
//		 letras.add('m');
//		 letras.add('a');
//		 for(int j = 0; j<=10;j++ ) {
//    	 for(int i = 0; i<4; ) {
//    		 char a = (char) (letras.get(r.nextInt(4)));
//    		 boolean ans = palabras.contains(a);
//    		 if(!ans) {
//    		 palabras.add(a);
//    		 i++;
//    		 
//    		 }
//    	 }
//    	 String word= new String();
//    	 for(char c:palabras){
//    		 word= word+ c; 
//    		 
//    		 }System.out.println(word+"1");	 
//    		 vocales.add(j, word);
//    		
//    	 }
//		 System.out.println(vocales+"2");
//    	 return vocales;
//    	 
//}
}
