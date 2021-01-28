package com.talento.java.probando;

public class MainWeb {

	public static void main(String[] args) {
		Web web = new Web();
		web.setNombre("Israel");
		System.out.println(web.getNombre());
		
		//llamado al metodo
		web.mostrarDatos();
		Web.visitantes ++;
		web.mostrarDatos();
		// llamado desde la clase
		Web.visitantes++;
		web.mostrarDatos();
		Web.visitantes++;
		web.mostrarDatos();

		System.out.println("total visitas: "+Web.visitantes);
	}

}
