package br.com.treinaweb.parte2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exemplo1  extends HttpServlet {
	//SerialVersion add para eliminar o Warrning.
	private static final long serialVersionUID = 1L;

	protected void doGet (HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Exemplo1</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h4>Primeiro exemplo de Servlet</h4>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
