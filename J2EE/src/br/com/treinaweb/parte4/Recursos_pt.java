package br.com.treinaweb.parte4;

import java.util.ListResourceBundle;

public class Recursos_pt extends ListResourceBundle{
	public Object[][] getContents(){
		return contents;
	}
	static final Objetc[][] contents ={
		{"login.apresentacao", "Bem VIndo"},
		{"login.usuario", "Usuario:"},
		{"login.senha", "Senha:"},
		{"login.correto","Login Correto"},
		{"login.incorreto", "Login Incorreto"}
	};

}
