package br.com.treinaweb.parte2;

public class Excessao5 {
	public static void main(String args[])
	{
		
		int i = 5;
		int[] v ={0,1,2,5};
		
				
		//Tratando os erros multiplos
		try{
			System.out.println(i/v[3]);//ArithmeticException
			System.out.println(v[1]);//ArrayIndexOutOfBoundsexception
		}catch(ArithmeticException e){
			System.out.println("Erro de Operaçao Aritimetica");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Erro de indice invalido do setor");
		}catch(Exception e){
			System.out.println("Erro generico,nao previsto acima.");
		}finally{
			System.out.println("Sempre passa aqui.");
		}
	
	}
}