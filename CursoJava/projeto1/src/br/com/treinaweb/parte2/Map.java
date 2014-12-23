package br.com.treinaweb.parte2;
import java.util.*;
public class Map {
	public static void main(String args[]){
		HashMap mapa = new HashMap();
		mapa.put("Curso 1", "JSE");
		mapa.put("Curso 2", "JME");
		mapa.put("Curso 3", "J2EE");
		mapa.put("Curso 4", "EJB");
		
		//obter o valor de uma chave
		String curso = (String)mapa.get("Curso 2");
		System.out.println(curso);
		
		//obter o numero de elementos
		int elementos = mapa.size();
		System.out.println("elementos :" + elementos);
		
		Iterator i = mapa.keySet().iterator();
		while(i.hasNext()){
			String chave = (String)i.next();
			curso = (String)mapa.get(chave);
			System.out.println(chave + ":" + curso);
		}
		mapa.remove("Curso 4");
		i = mapa.keySet().iterator();
		while(i.hasNext()){
			String chave = (String)i.next();
			curso = (String)mapa.get(chave);
			System.out.println(chave + ":" + curso);
		}
		i = mapa.keySet().iterator();
		while(i.hasNext()){
			String chave = (String)i.next();
			curso = (String)mapa.get(chave);
			System.out.println(chave + ":" + curso);
		}
		
		//Limpando o mapa.
		mapa.clear();
		elementos = mapa.size();
		System.out.println("elementos :" + elementos);
	}
}
