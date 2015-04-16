package com.zubiri.Formulario2;

import java.io.IOException;
import java.io.PrintWriter;

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
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		String pass2 = request.getParameter("pass2");
		String nombre = request.getParameter("nombre");
		String apellido1 = request.getParameter("apellido1");
		String apellido2 = request.getParameter("apellido2");
		String dni = request.getParameter("dni");
		String sexo = request.getParameter("sexo");
		
		out.println("<html>");
		out.println("<head><title></title></head>");
		out.println("<body>");	
		if (pass.equals(pass2)){
			out.println("<p>¡Registro realizado correctamente!</p>");
			out.println("<p>Tus datos son los siguientes: </p>");
			out.println("<p>Nombre completo: "+nombre+" "+apellido1+" "+apellido2+"</p>");
			out.println("<p>DNI: "+dni+"</p>");
			out.println("<p>Sexo: "+sexo+"</p>");
			out.println("<p>Nombre de usuario: "+usuario+"</p>");
		}else {
			out.println("<p>¡ERROR! Las contraseñas 1 y 2 no coinciden...</p>");
		}
		out.println("</body></html>");
	}

}
