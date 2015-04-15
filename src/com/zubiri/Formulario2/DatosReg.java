package com.zubiri.Formulario2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatosReg
 */
public class DatosReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatosReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		String pass2 = request.getParameter("pass2");
		String nombre = request.getParameter("nombre");
		String apellido1 = request.getParameter("apellido1");
		String apellido2 = request.getParameter("apellido2");
		String dni = request.getParameter("dni");
		String sexo = request.getParameter("sexo");
		if (pass.equals(pass2)){
			System.out.println("¡Registro realizado correctamente!");
			System.out.println("Tus datos son los siguientes: ");
			System.out.println("Nombre completo: "+nombre+" "+apellido1+" "+apellido2);
			System.out.println("DNI: "+dni);
			System.out.println("Sexo: "+sexo);
			System.out.println("Nombre de usuario: "+usuario);
		}else {
			System.out.println("¡ERROR! Las contraseñas 1 y 2 no coinciden...");
		}
	}

}
