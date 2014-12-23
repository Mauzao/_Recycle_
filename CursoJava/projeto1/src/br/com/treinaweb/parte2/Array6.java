package br.com.treinaweb.parte2;
import java.util.Arrays;
public class Array6 {
	public static void main(String args[]){
		char[] nota = {'B','C','D','A','E'};
		
		Arrays.sort(nota);
		
		int posicao = Arrays.binarySearch(nota,'C');
		
		System.out.println("O elemento 'C' esta na posiçào :" + posicao);
	}
}
