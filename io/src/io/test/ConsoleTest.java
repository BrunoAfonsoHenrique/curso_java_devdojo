package io.test;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		//Console --> Classe que trabalha com entrada de dados via terminal
		
		Console c = System.console();
		char[] pw = c.readPassword("%s", "pw: ");
		for(char pass: pw) {
			c.format("%c", pass);
		}
		c.format("\n");
		
		String texto;
		while(true) {
			texto = c.readLine("%s", "\nDigite: ");
			c.format("esse texto (%s) foi digitado", retorno(texto));
		}
	
	}
	
	public static String retorno(String argumento1) {
		return argumento1;
	}

}
