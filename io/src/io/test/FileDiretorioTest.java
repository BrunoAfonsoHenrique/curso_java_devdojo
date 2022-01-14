package io.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {

	public static void main(String[] args) throws IOException {
//		File diretorio = new File("C:\\Users\\Usuário\\Desktop\\devdojo\\io\\folder");
//		boolean mkdir = diretorio.mkdir(); // createNewFile() --> para criar arquivos | mkdir -> criar diretórios
//		System.out.println("Diretorio criado " + mkdir);
//		
//		File arquivo = new File("C:\\Users\\Usuário\\Desktop\\devdojo\\io\\folder\\arquivo.txt");
//		boolean novoArquivo = arquivo.createNewFile();
//		System.out.println("Arquivo criado " + novoArquivo);
//		
//		File arquivoNovoNome = new File("C:\\Users\\Usuário\\Desktop\\devdojo\\io\\folder\\arquivo_renomeado.txt");
//		boolean renomeado = arquivo.renameTo(arquivoNovoNome);
//		System.out.println("Renomeado: " + renomeado);
//		
//		//Renomeando diretório
//		File diretorioRenomeado = new File("folder2");
//		boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
//		System.out.println("Diretório renomeado: " + diretorioRenamed);
		
		buscarArquivos();
	}
	
	//Fazer uma busca dentro do diretório
	public static void buscarArquivos() {
		File file = new File("folder2");
		String[] lista = file.list();
		for(String percorrer : lista) {
			System.out.println(percorrer);
		}
	}

}
