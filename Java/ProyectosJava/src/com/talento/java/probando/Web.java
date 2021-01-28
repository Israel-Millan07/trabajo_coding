package com.talento.java.probando;

public class Web {
	//atributos
	private String nombre;
	public static Integer visitantes =0;
	//constructor
	public Web() {
		visitantes ++;//las variables de tipo static no necesitan el this.
	}
	public Web(String nombre) {
		super();
		this.nombre = nombre;
	}
	//metodos
	
		public void mostrarDatos() {
			System.out.println("variable nombre:"+nombre);
			System.out.println("variable visitantes:"+ visitantes );
		}

	//get and set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
