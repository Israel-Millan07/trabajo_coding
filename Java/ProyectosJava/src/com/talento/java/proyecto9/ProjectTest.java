package com.talento.java.proyecto9;

import java.util.Scanner;

public class ProjectTest {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Project pro = new Project();
			pro.elevatorPitch();
			System.out.println(pro.elevatorPitch());
			Project constructor = new Project("Israel","El que esta por sobre todo");
			System.out.println(constructor.getNombre()+" "+constructor.getDescripcion());
			pro.setNombre("Israel");
			pro.setDescripcion("El mejor papá");
			System.out.println("NOMBRE: "+pro.getNombre());
			System.out.println("DESCRIPCION: "+pro.getDescripcion());
			System.out.println("Ingrese el nombre:");
			String nombre = sc.next();
			pro.setNombre(nombre);
			System.out.println("Insgrese una descripcion:");
			String descripcion = sc.next();
			pro.setDescripcion(descripcion);
			System.out.println("nombre: "+pro.getNombre());
			System.out.println("descripcion: "+pro.getDescripcion());
		}
		}
	}

