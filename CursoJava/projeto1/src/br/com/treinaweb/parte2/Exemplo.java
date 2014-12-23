package br.com.treinaweb.parte2;

public class Exemplo {
		public static void main(String args[]){
			//chamada ao primeiro metodo
			imprimir();
			//chamada ao segundo metodo
			imprimir("Yasmin");
		}
		
		public static void imprimir(){
			System.out.println("Silvia");
		}
		
		public static void imprimir(String nome){
			System.out.println(nome);
		}
}
