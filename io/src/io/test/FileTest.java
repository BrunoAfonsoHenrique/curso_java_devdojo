package io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Users\\Usu?rio\\Desktop\\devdojo\\io\\arquivoscriados\\Arquivo.txt");
		try {
			boolean novoArquivo = arquivo.createNewFile(); // criando o arquivo
			System.out.println(novoArquivo);
			
			boolean exiteArquivo = arquivo.exists();
			
			System.out.println("Permite leitura? " + arquivo.canRead());
			System.out.println("Path: " + arquivo.getPath());
			System.out.println("path: " + arquivo.getAbsolutePath());
			System.out.println("diretorio? " + arquivo.isDirectory());
			System.out.println("? um arquivo oculto? " + arquivo.isHidden());
			System.out.println("last modified? "+ new Date(arquivo.lastModified())); // tempo em milisegundos
			if(exiteArquivo) {
				System.out.println("Deletado? " + arquivo.delete());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
