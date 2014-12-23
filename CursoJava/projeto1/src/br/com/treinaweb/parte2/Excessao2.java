package br.com.treinaweb.parte2;

public class Excessao2 {
	public static void main(String args[])
	{
		//Tratando o erro por divisao por zero
		int i = 5;
		int x = 0;
		int r = 0;
		
		try{
			r = i/x;
		}catch(Exception e){
			
		}
		
		System.out.println("r =" + r);
	}
		
}
