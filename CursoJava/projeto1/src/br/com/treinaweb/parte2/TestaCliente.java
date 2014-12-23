package br.com.treinaweb.parte2;

public class TestaCliente {
		public static void main(String args[]){
			Cliente c = new Cliente();
			
			c.setCodigo(1);
			c.setNome("Joao");
			System.out.println(c.getCodigo());
			System.out.println(c.getNome());
			
		}
}
