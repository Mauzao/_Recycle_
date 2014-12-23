package br.com.treinaweb.parte4;

import java.util.ListResourceBundle;

public class Recursos_fr extends ListResourceBundle{
	public Object[][] getContents(){
		return contents;
	}
	static final Objetc[][] contents ={
		{"login.apresentacao", "Bienvenue"},
		{"login.usuario", "Utilisateur:"},
		{"login.senha", "Mot de Passe:"},
		{"login.correto","Ouverture correcte"},
		{"login.incorreto", "Ouverture incorrecte"}
	};

}
