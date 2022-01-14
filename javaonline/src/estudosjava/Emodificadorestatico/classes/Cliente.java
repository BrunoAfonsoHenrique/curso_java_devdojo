package estudosjava.Emodificadorestatico.classes;

public class Cliente {
	// 0 - Bloco de inicialização é executado quando a JVN carregar a classe (é executado apenas 1 vez)
	// 1 - Alocado espaço na memória para o objeto que será criado
	// 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
	// 3 - Bloco de inicialização é executado
	// 4 - O construtor é executado
	
	private static int[] parcelas;
	{
		System.out.println("Bloco de inicialização não estatico");
	}
	
	// Criando um bloco de inicialização
	static { // Bloco de inicialização estatico é executado apenas uma vez
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicialização estatico");
		for(int i = 1; i <= 100; i++) {
			parcelas[i - 1] = i;
		}
	}
	
	static { 
		System.out.println("bloco estatoico 2");
	}

	
	static { 
		System.out.println("bloco estatoico 3");
	}
	
	public Cliente() {
		
	}

	public static int[] getParcelas() {
		return parcelas;
	}
	
	
}
