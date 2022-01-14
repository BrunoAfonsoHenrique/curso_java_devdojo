package io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Users\\Usuário\\Desktop\\devdojo\\io\\arquivoscriados\\Arquivo.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){
			BufferedReader br = new BufferedReader(new FileReader(arquivo));
			
			bw.write("Escrevendo uma mensagem no arquivo");
			bw.newLine();
			bw.write("E Pulando uma linha 3");
			bw.flush();
			
			String s;
			while((s=br.readLine()) != null) {
				System.out.println(s);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
//		try {
//			FileWriter escreverNoArquivo = new FileWriter(arquivo); //new FileWriter(arquivo, true);
//			BufferedWriter bw = new BufferedWriter(escreverNoArquivo);
//			
//			
//			bw.close();
//			
//			FileReader lendoArquivo = new FileReader(arquivo);
//			BufferedReader br = new BufferedReader(lendoArquivo);
//			String s = null;
//			while((s=br.readLine()) != null) {
//				System.out.println(s);
//			}
//			br.close();
//			
//		
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//	}

	}

}
