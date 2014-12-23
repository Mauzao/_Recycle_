package br.com.treinaweb.parte2;
import java.util.Arrays;
public class Array4 {
	public static void main(String args[]){
		char [] n1 = {'D','A','C','D','E'};
		char [] n2 = {'D','A','D','C','E'};
		
		if(Arrays.equals(n1, n2)){
			System.out.println("Os arrays sao iguais");
		}else{
			System.out.println("Os Arrays sao diferentes");
		}
	}
}
