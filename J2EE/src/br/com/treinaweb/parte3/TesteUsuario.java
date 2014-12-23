package br.com.treinaweb.parte3;

public class TesteUsuario {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Usuario c = new Usuario();
	    String login = "murilo@teste.com.br";
	    String nome = "Maurilo";
	    String senha = "124578";
	    c.setNome(nome);
	    c.setLogin(login);
	    c.setSenha(senha);
	    c.incluir();
	    int idusuario = c.verificarUsuario(login,senha);
	    System.out.println("idusuario: " + idusuario);
	  }
	}

