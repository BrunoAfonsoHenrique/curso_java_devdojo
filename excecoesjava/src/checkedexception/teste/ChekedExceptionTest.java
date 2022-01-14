package checkedexception.teste;

import java.io.File;
import java.io.IOException;

public class ChekedExceptionTest {

	public static void main(String[] args) {
//		try {
//			criarArquivo();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
		abrirArquivo();


	}
	
	public static void criarArquivo() throws IOException{
		File arquivo = new File("Teste.txt");

		try {
			
			System.out.println("Arquivo criado? " + arquivo.createNewFile());
			System.out.println("Arquivo criado");
			
		}
		catch(IOException e) { // criando uma variável de referencia do tipo IOException
			e.printStackTrace();
			throw e;
		}
		finally {
			System.out.println("Fechar o arquivo");
		}
	}
	
	public static void abrirArquivo(){
		try {
			System.out.println("Abrindo um arquivo");
			System.out.println("Executando a leitura do arquivo");
			//throw new Exception();
			System.out.println("escrevendo no arquivo");
		}
		catch(Exception e) { 
			System.out.println("Dentro do catch");
			e.printStackTrace();
		}
		finally { // Finally sempre é executado
			System.out.println("Fechar o arquivo");
		}
	}

}
