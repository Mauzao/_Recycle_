package br.com.treinaweb.parte3;

public class TesteFloat {
	public static void main(String args[]){
		//Obtendo o menor e o maior valor
		float maior = Float.MAX_VALUE;
		float menor = Float.MIN_VALUE;
		System.out.println("Maior valor :" + maior);
		System.out.println("Menor valor :" + menor);
		
		String s = "123";
		float b = 0;
		//Convertendo String para Byte
		b = Float.parseFloat(s);
		//Convetendo de Byte para String;
		s = Float.toString(b);
	}
}
