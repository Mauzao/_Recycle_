package br.com.treinaweb.parte2;

public class Excessao1 {
	public static void main(String args[])
	{
		//Sem tratar o erro de divisao por 0
		int i = 5;
		int x = 0;
		int r = 0;
		r = i/x;
		System.out.println("r =" + r);
	}
		
}
