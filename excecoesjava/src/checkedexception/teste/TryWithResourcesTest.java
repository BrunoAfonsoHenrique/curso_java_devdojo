package checkedexception.teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import checkedexception.classes.Leitor1;
import checkedexception.classes.Leitor2;

public class TryWithResourcesTest {
	
	public static void main(String[] args) {
		lerArquivo();
	}
	
	
	// Trabalhar com arquivos ou conexão com banco de dados
	public static void lerArquivo() {
		
		try(Leitor2 leitor2 = new Leitor2();
			Leitor1 leitor1 = new Leitor1()	) {
	
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void lerArquivoOld() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("text.txt"));
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(reader != null) {
					reader.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
