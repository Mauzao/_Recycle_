package br.com.treinaweb.parte2;

public class Cliente {
		public int codigo = 2;
		public String nome = "Joao";
		public boolean ativo = true;
		
		public int getCodigo(){
		return codigo;
		}
		
		public void setCodigo(int codigo){
			this.codigo = codigo;
		}
		
		public String getNome(){
			return nome;
		}
		
		public void setNome(String nome){
			this.nome=nome;
		}
		
		public boolean getAtivo(){
			return ativo;
		}
		
		public void setAtivo (boolean ativo){
			this.ativo = ativo;
		}
}
