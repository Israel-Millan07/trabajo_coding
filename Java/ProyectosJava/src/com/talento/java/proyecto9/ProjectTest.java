package com.talento.java.proyecto9;

import java.util.ArrayList;

public class ProjectTest {

	public static void main(String[] args) {
		Project pro = new Project();
		pro.setNombre("Israel");
		ArrayList <Project> nuevoProyecto = new ArrayList<Project>();
		nuevoProyecto.add(pro);
		nuevoProyecto.add(new Project("Israel","El que esta por sobre todo"));
		nuevoProyecto.add(new Project("Israel"));
		for (Project project : nuevoProyecto) {
			System.out.println(project.getNombre()+" "+ project.getDescripcion());
		}
	}

}
