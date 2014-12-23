package br.com.treinaweb.parte2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exemplo4 implements Servlet{
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
		String nome = servletRequest.getParameter("nome");
		ServletContext contexto = configuracao.getServletContext();
		contexto.setAttribute("nome", nome);
		PrintWriter out = servletResponse.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Gravando no Contexto</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h4>Gravando no Contexto</h4><br>");
		out.println("Gravando no Contexto" +contexto.getAttribute("nome"));
		out.println("<br><a href='Ex5'>Verificar</a>");
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
