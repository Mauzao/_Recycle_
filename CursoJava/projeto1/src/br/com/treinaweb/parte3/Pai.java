package br.com.treinaweb.parte3;

public class Pai {
	protected String status = "Status Pai";
	
	public void imprimir(){
		System.out.println(status);
	}
	public void imprimir(String imprimir){
		System.out.println(status);
		System.out.println(this.status);
	}
}
