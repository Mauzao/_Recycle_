package br.com.treinaweb.parte1;

public class TestaConexao {
		public static void main(String args[]){
			Conexao.getConnection();
			System.out.println(Conexao.status);
		}
		
}
