package br.com.treinaweb.parte2;

public class Excessao4 {
	public static void main(String args[])
	{
		//erros multiploes para ser tratado
		int i = 5;
		int[] v ={0,1,2,3};
		
		System.out.println(i/v[0]);//ArithmeticException
		System.out.println(v[4]);//ArrayIndexOutOfBoundsexception
	}
}