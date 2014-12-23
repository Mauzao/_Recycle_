package br.com.treinaweb.parte3;

public class TesteBoolean {
	public static void main(String args[]){
		boolean b = false;
		if(b == false){
			System.out.println("False");
		}
		
		String s = "false";
		//Convertendo String para Boolean
		
		b = Boolean.parseBoolean(s);
		//Convertendo Boolena para String
		s = Boolean.toString(b);
	}
}
