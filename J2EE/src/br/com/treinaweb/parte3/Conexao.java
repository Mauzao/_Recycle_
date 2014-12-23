package br.com.treinaweb.parte3;
import java.sql.*;

public class Conexao {
	public static String status = "";
	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://127.0.0.1/javacurso?user=root&password=admin";
			con= DriverManager.getConnection(url);
			status = "Conexao Aberta";
		}catch(SQLException e){
			status = e.getMessage();
		}catch(ClassNotFoundException e){
			status = e.getMessage();
		}catch(Exception e){
			status = e.getMessage();
		}
		return con;
	}

}
