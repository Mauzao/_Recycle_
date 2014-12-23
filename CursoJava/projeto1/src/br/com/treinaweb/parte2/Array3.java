package br.com.treinaweb.parte2;
import java.util.Arrays;

public class Array3 {
	public static void main(String args[]){
		char [] nota = {'A','D','B','E','C'};
		for (int i = 0; i  < nota.length; i++){
			System.out.println("Nota =" +nota[i]);
			}
		
		Arrays.sort(nota);
		for(int i =0 ;i < nota.length; i++){
			System.out.println("Nota =" + nota[i]);
		}
	}
}
