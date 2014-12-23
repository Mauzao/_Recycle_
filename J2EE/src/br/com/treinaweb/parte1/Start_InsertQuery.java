package br.com.treinaweb.parte1;
import java.sql.*;

public class Start_InsertQuery {
	
	public static void main(String args[]) throws SQLException{
		Connection cn = Conexao.getConnection();
		Statement st = cn.createStatement();
		String q = "";
		q += "insert into usuario (nome, login, senha)";
		q += "values ('Maurilio', 'mauriliofilho22@gmail.com', '210984')";
		st.executeUpdate(q);
		}

}
