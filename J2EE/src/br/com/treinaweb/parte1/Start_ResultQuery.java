package br.com.treinaweb.parte1;
import java.sql.*;

public class Start_ResultQuery {
	public static void main(String args[]) throws SQLException{
		Connection cn = Conexao.getConnection();
		Statement st = cn.createStatement();
		String q = "";
		q += "select nome from usuario ";
		q += "where idusuario = 2";
		ResultSet rs = st.executeQuery(q);
			if (rs.next()){
				String  nome = rs.getString("nome");
				System.out.println(nome);
		}
	}
}
