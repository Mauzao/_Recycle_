package br.com.treinaweb.parte4;

import java.util.ListResourceBundle;

public class Recursos_en extends ListResourceBundle{
	public Object[][] getContents(){
		return contents;
	}
	static final Objetc[][] contents ={
		{"login.apresentacao", "welcome"},
		{"login.usuario", "Users:"},
		{"login.senha", "Password:"},
		{"login.correto","Corrrect Login"},
		{"login.incorreto", "Incorrect Login"},
	};

}
