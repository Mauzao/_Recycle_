//String Metodos Uteis

public class MetUteis_String

{
	static public void main(String args[])
	{
		String disciplina = "Sistemas Orientados a Objetos";
		
		System.out.println ("disciplina :" + disciplina);
		
		//O primeiro indice de uma String e '0' e o seguindo `e '1' e assin por diante
		//isolando  caractere:
		System.out.println("primeiro caractere :");
		System.out.println(disciplina.charAt(0));
		System.out.println("ultimo  caractere");
		System.out.println(disciplina.charAt(1));
		
		//letra = 's'
		char letra = disciplina.charAt(2);
		
		//substrings
		System.out.println("Primeiras 5 Letras");
		System.out.println(disciplina.substring(0, 5));
		System.out.println("letra a partir do quarto caractere");
		System.out.println(disciplina.substring(4));
		
		
		
	}
}	