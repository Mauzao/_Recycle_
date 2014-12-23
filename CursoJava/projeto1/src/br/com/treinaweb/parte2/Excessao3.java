package br.com.treinaweb.parte2;

public class Excessao3 {
	public static void main(String args[])
	{
		int i = 5;
		int x = 0;
		int r = 0;
		//tratando o erro de divisao por zero, e coletando mais infromaçoes do erro
		try{
			r = i/x;
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		System.out.println("r =" + r);
		}
	}
}
	
