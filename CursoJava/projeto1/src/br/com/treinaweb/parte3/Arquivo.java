package br.com.treinaweb.parte3;
import java.io.*;
public class Arquivo {
	public static void main(String args[]){
		lerArquivo("c:\\ler.txt");
		
	}
	public static void lerArquivo(String arquivo){
	File f = new File(arquivo);
	if(!f.exists()){
		System.out.println("Arquivo " + arquivo + " nao exixte");
		return;
	}
	try{
		//is zrepresenta o fluxo de entrada a partir de um arquivo
		InputStream is = new FileInputStream(arquivo);
		//InputStreamReader é a classe para converter bytes em chars
		InputStreamReader isr = new InputStreamReader(is);
		//bufferedReader é uma classe que armazena os char na memoria
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		while(s!=null){
			System.out.println(s);
			s=br.readLine();
		}
	}catch(Exception x){
		System.out.println(x.getMessage());
	}
	}
}
