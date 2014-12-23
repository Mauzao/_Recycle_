package br.com.treinaweb.parte2;
import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;


public class Exemplo3 implements Servlet{
	//Classe Exemplo3 Le todos os paramentros no arquivos Web ini.
	Enumeration<String> atributos = null;
	ServletConfig configuracao = null;
	
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	}
	
	public void init(ServletConfig servletConfig) throws ServletException{
		configuracao = servletConfig;
		
	}
	public ServletConfig getServletConfig(){
		return null;
	}
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
		throws ServletException, IOException{
	 servletResponse.setContentType("text/html");
	 PrintWriter out = servletResponse.getWriter();
	 	out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Cadastro de Produtos</title>");
	    out.println("</head>");
	    out.println("<body>");
	    atributos = configuracao.getInitParameterNames();
	    while(atributos.hasMoreElements()){
	      String nome = (String) atributos.nextElement();
	      String valor = configuracao.getInitParameter(nome);
	      out.println("<h4>" + nome + ":" + valor + "</h4><br>");
	    }
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