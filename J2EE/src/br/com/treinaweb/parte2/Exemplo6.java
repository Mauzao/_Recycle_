package br.com.treinaweb.parte2;
import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exemplo6  extends HttpServlet {
	/**
	 * Correcao de warnning em relacao a classe Exemplo6
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException{
			Enumeration<String> enumeracao = request.getHeaderNames();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Exemplo 6</title>");
			out.println("</head>");
			out.println("<body>");
			while(enumeracao.hasMoreElements()){
				String header = (String) enumeracao.nextElement();
				out.println("<br>" + header + "</br>" + request.getHeader(header) + "<hr>");
			}
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}
