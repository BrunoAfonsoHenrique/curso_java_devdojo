package estudosjava.Nexception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		criarArquivo();
		

	}
	
	public static void criarArquivo() {
		
		File file = new File("Teste.txt");
		try {
			System.out.println("Arquivo criado: " + file.createNewFile()); // Se acontecer algo aqui
			System.out.println("Arquivo criado");
		}catch(IOException e) { // Java vai pular para essa linha
			// Aqui sempre tem que ter um código
			e.printStackTrace();
		}
		
		
	}

}
