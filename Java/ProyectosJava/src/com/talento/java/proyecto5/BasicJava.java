package com.talento.java.proyecto5;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
	
	//Escriba un m�todo que imprima todos los n�mero del 1 al 255.
	void printNumber() {
		for (int i=1; i<=255; i++) {
			System.out.println(i);
		}
	}
	//Escriba un m�todo que imprima todos los n�mero impares entre el 1 al 255.
	void printImpar() {
		for (int i=1; i<=255; i+=2) {
			System.out.println(i+" impar");
		}
	}
	//Escriba un m�todo que imprima los n�meros desde el 0 hasta el 255, 
	//pero esta vez muestre tambi�n las suma de los n�meros que ha mostrado en pantalla hasta ahora.
	void printSum() {
		int sum = 0;
		for (int i=0; i<=255; i++) {
			sum= sum  + i;
			System.out.println(" Nuevo Numero "+ i + " suma " + sum);
		}
	}
	//Recorrer un Arreglo

	//Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un m�todo que recorra cada uno de los elementos del arreglo e 
	//imprima cada valor. Ser capaz de recorrer cada elemento de un arreglo es extremadamente importante.
	void arreglo() {
		int arr[]= {1,3,5,7,9,13};
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr [i]);
		}
	}
	//Encontrar el M�ximo

//Escribir un m�todo que tome un arreglo e imprima el valor m�ximo en el arreglo. Su m�todo deber�a funcionar 
//tambi�n con todos los n�meros en negativo (ejemplo [-3,-5,-7]), o incluso una mezcla de n�meros positivos, n�meros negativos y cero.
	void arrMax() {
		int array[]= {-3,-5,-7};
		int max = array[0];
		for (int i=0; i<array.length; i++) {
			if(array[i]> max) {
				max= array[i];
			}
		}
		System.out.println("El Mayor es: "+max);
	}
	//Obtener el Promedio

//Escribir un m�todo que tome un arreglo e imprima el promedio de los valores en el arreglo. 
//Por ejemplo en un arreglo hay [2,10,3], su m�todo deber�a Imprimir �Promedio de 5�. 
//Nuevamente, aseg�rese de crear un caso simple y escriba las instrucciones para resolver ese caso primero, 
//luego pruebe sus instrucciones con casos m�s complicados.
	void promPrint() {
		int arr[]= {2,10,3};
		int sum = 0;
		int div = 0;
		int prom = 0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			div = arr.length;
			prom = sum/div;
		}
		System.out.println("El promedio es: "+prom);
	}
//Arreglo con N�meros Impares

//Escribir un m�todo que cree un arreglo �y� que contenga todos los n�meros impares entre 1 - 255. 
//Cuando el m�todo haya terminado, �y� debe tener los valores de [1,3,5,7�255].
	void arrayImpares (){
		int y[];
		y = new int[256];
		int j = 0;
	 	for(int i=1; i<=255;i++){
	 		
	 		if(i%2!=0) {
	 			y[j] =  i;
	 			j++;
	 		}  				
		}
	 	System.out.println(Arrays.toString(y));
	}
//Mayor que Y

//Escribir un m�todo que tome un arreglo y devuelva el n�mero de valores mayores a un valor Y dado. 
//Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, despu�s de terminar el proceso el m�todo debe Imprimir el n�mero 2 
//(ya que hay 2 valores en el arreglo que son mayores que 3).
	void mayorY (){
		   int sum=0;
		   int arr[] = {1,3,5,7};
		   int Y = 3;
		   for(int i=0;i<arr.length;i++){
		    if(arr[i]>Y){
		        sum++;
		    }
		
		   }
		   System.out.println(sum);
		}
//Valores al Cuadrado

//Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un m�todo que multiplique cada valor en el arreglo por s� mismo. 
//Cuando el m�todo haya terminado, el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].
	 void cuadrado () {
		 int array[] = {1,5,10,-2};
		 
		  for( int i=0;i<=3;i++){
			  array[i] = array [i] * array[i];
			  System.out.println(array[i]);
		    }
		 
		}
//Eliminar N�meros Negativos

//Dado un arreglo x, digamos [1,5,10,-2], escribir un m�todo que reemplace cualquier n�mero negativo por 0. 
	//Cuando el m�todo haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].}
	 void numNeg () {
			int arr[]= {1,5,10,-2};
			  for( int i=0;i<4;i++){
				  if(arr[i]>0){
			      arr [i] = arr[i];
			      
			       }else {     
			    	   arr [i] = 0;       
		}
		
			  }System.out.println(Arrays.toString(arr));
		}
//M�nimo, M�ximo y Promedio

//Dado un arreglo x, digamos [1,5,10,-2], escribir un m�todo que devuelva un arreglo con el n�mero m�ximo, 
//el n�mero m�nimo y el valor promedio que hay en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].
	 void nuevoArray(){
	     int suma=0;
	     int arr[] = {1,5,10,-2}; 
	     int mayor= arr[0];
	     int menor= arr[0];
	     int prom= 0;
	     ArrayList<Integer> lista = new ArrayList<Integer>();
	    for(int i=0;i<4;i++){
	    
	        suma = suma + arr[i];
	        if(arr[i]>mayor){
	            mayor=arr[i];
	           
	        }
	        if(arr[i]<menor){
	            menor=arr[i];
	            
	        }
	    }prom=suma/4;
	    lista.add(mayor);
	    lista.add(menor);
	    lista.add(prom);
	    System.out.println(lista.toString());
	}
//Cambiando los Valores del Arreglo

//Dado un arreglo x, digamos [1,5,10,7,-2], escribir un m�todo que cambie cada valor por el valor que sigue. 
//Por ejemplo, cuando el m�todo haya terminado, un arreglo x [1,5,10,7,-2] se convertir� en [5,10,7,-2,0]. 
//Observe que el �ltimo n�mero es 0. El m�todo no necesita ajustarse para los valores que est�n fuera de los l�mites.
	 void IntercambiaValores(){
			int arr[] = {1,5,10,7,-2};
		    for( int i=0;i<=4;i++){
		    	if(i==4){
		            arr[i]=0;
		           }if(i<=3) {
		        	   
		        	   arr[i] = (arr[i+1]);
		        	   }
		        
		    } 
			System.out.println(Arrays.toString(arr));
			}
}