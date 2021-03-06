package io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReaderTest {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Users\\Usu?rio\\Desktop\\devdojo\\io\\arquivoscriados\\Arquivo.txt");
		
		try(FileWriter escreverNoArquivo = new FileWriter(arquivo)){
			FileReader lendoArquivo = new FileReader(arquivo);
			escreverNoArquivo.write("Escrevendo uma mensagem no arquivo\nPulando linha");
			escreverNoArquivo.flush();
			escreverNoArquivo.close();
			
			FileReader lerArquivo = new FileReader(arquivo);
			char[] entrada = new char[500];
			int tamanho = lerArquivo.read(entrada);
			System.out.println("Tamanho: " + tamanho);
			
			for(char c : entrada) {
				System.out.print(c);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
//		try {
//			FileWriter escreverNoArquivo = new FileWriter(arquivo); //new FileWriter(arquivo, true);
//			escreverNoArquivo.write("Escrevendo uma mensagem no arquivo\nPulando linha");
//			escreverNoArquivo.flush();
//			escreverNoArquivo.close();
//			
//			FileReader lendoArquivo = new FileReader(arquivo);
//			char[] entrada = new char[500];
//			int tamanho = lendoArquivo.read(entrada);
//			System.out.println("Tamanho: " + tamanho);
//			
//			for(char c : entrada) {
//				System.out.print(c);
//			}
//			lendoArquivo.close();
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
	}

}
