package br.com.treinaweb.parte2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exemplo5 implements Servlet{
	
	
	ServletConfig configuracao = null;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	}
	
	public void init(ServletConfig servletConfig) throws ServletException{
		configuracao = 	servletConfig;
	}
	
	public ServletConfig getServletConfig(){
		return null;
	}
	
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
		throws ServletException, IOException{
		servletResponse.setContentType("text/html");
		ServletContext contexto = configuracao.getServletContext();
		String nome = (String) contexto.getAttribute("nome");
		
		PrintWriter out = servletResponse.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Lendo do Contexto</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h4>Lendo do Contexto</h4><br>");
		out.println("nome" + nome);
		out.println("<br><a href='visistantes.jsp'>Voltar</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	
	public String getServletInfo(){
		return null;
	}
	public void destroy(){
		
	}

}
