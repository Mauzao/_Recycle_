package br.com.treinaweb.parte2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exemplo3_teste1 implements Servlet{
	//Class Exemplo3 Le apenas os que estao setados nas tags e variaveis.
	String servidor = "";
	String banco	= "";
	String usuario	= "";
	String senha	= "";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
	}
	
	public void init(ServletConfig servletConfig) throws ServletException{
		servidor = servletConfig.getInitParameter("servidor");
		banco = servletConfig.getInitParameter("banco");
		usuario = servletConfig.getInitParameter("usuario");
		senha = servletConfig.getInitParameter("senha");
	}
	
	public ServletConfig getServletConfig(){
		return null;
	}
	
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
		throws ServletException, IOException{
		servletResponse.setContentType("text/html;charset=UTF-8");
		PrintWriter out = servletResponse.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cadastro de Produtos</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h4>Servidor: " + servidor + "</h4>");
		out.println("<h4>Banco: " + banco + "</h4>");
		out.println("<h4>Usuario: " + usuario + "</h4>");
		out.println("<h4>Senha: " + senha + "</h4>");
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