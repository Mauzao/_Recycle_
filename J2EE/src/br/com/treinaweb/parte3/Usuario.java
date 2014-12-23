package br.com.treinaweb.parte3;
import java.sql.*;


public class Usuario {
	
	private int idusuario = 0;
	private String nome = "";
	private String login = "";
	private String senha = "";
	private String status = "";
	
	
	public int getIdusuario() {
		return idusuario;
	}


	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int verificarUsuario (String login, String senha){
		String q = "";
		q += " select idusuario from usuario ";
		q += " where login = '" + login + "' ";
		q += " and senha =  '" + senha + "' ";
		
		Connection con = Conexao.getConnection();
		try{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			if(rs.next()){
				idusuario = rs.getInt("idusuario");
			}
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return idusuario;
	}
	
	public void incluir(){
		String q = "";
		if(nome != ""){
			q += "insert usuario(nome, login, senha) values ('" + nome + "','" + login + "','" + senha + "');";
			Connection con = Conexao.getConnection();
			try{
				Statement st = con.createStatement();
				st.executeUpdate(q);
				status = "Usuario " + nome + " incluido com sucesso!";
			}catch(SQLException e){
				status = "Nao foi possivel incluir o " + nome;
			}
		}
	}
}
