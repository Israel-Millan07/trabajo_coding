package com.talento.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import como.talento.web.models.Person;

@WebServlet("/ShowPerson")
public class ShowPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ShowPerson() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Procesar la solicitud
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        // Crear el modelo
        Person person = new Person(name, age);
        // Establecer el modelo para la vista
        request.setAttribute("person", person);
        // Permita que la vista maneje la solicitud 
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/showPerson.jsp");
        view.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
