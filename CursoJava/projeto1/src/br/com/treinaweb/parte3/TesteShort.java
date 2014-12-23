package br.com.treinaweb.parte3;

public class TesteShort {
	public static void main(String args[]){
		//Obtendo o menor e o maior valor
		short maior = Short.MAX_VALUE;
		short menor = Short.MIN_VALUE;
		System.out.println("Maior valor :" + maior);
		System.out.println("Menor valor :" + menor);
		
		String s = "123";
		short b = 0;
		//Convertendo String para Byte
		b = Short.parseShort(s);
		//Convetendo de Byte para String;
		s = Short.toString(b);
	}
}
