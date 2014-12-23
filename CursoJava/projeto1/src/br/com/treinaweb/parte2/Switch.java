package br.com.treinaweb.parte2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
		public static void main(String args[]) throws IOException{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Digite o numero de um mes do ano");
			String mes = in.readLine();
			switch(Integer.parseInt(mes)){
			case 1:
			System.out.println("Janeiro");
			break;
			case 2:
			System.out.println("Fevereiro");
			break;	
			case 3:
			System.out.println("Março");
			break;
			case 4:
			System.out.println("Abril");
			break;
			case 5:
			System.out.println("Maio");
			break;
			default:
			System.out.println("nada");
			case (char) 13: // utilizado para tratar o enter
			System.out.println("Foi digitado apenas um <enter>.");
			break;
			
			}
			
		}
}
