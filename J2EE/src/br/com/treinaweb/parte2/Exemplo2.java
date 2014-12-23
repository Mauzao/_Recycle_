package br.com.treinaweb.parte2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Exemplo2 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	String login = request.getParameter("login");
	String senha = request.getParameter("senha");
	
	response.setContentType("text/html;charset=UTF-8");
	
	PrintWriter out = response.getWriter();
	
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Tela de Login</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h4>Obtendo dados do Formulario</h4>");
	out.println("Login :" +login + "<br>");
	out.println("Senha :" +senha + "<br>");
	out.println("</body>");
	out.println("</html>");
	out.close();
	
	}
	
}
