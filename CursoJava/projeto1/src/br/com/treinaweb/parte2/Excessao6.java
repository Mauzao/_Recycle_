package br.com.treinaweb.parte2;

public class Excessao6 {
	public static void main(String args[]){
		int a = 0;
		try{
			a = obterDivisao(6,0);
		}catch(ArithmeticException e){
			System.out.println("divisao por zero");
		}
			System.out.println("a :" + a);
	}
	
	static int obterDivisao (int V1, int V2)
	throws ArithmeticException{
		int r = 0;
		r = V1/V2;
		return r;
	}
}
