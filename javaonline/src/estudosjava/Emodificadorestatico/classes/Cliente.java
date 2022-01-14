package estudosjava.Emodificadorestatico.classes;

public class Cliente {
	// 0 - Bloco de inicializa��o � executado quando a JVN carregar a classe (� executado apenas 1 vez)
	// 1 - Alocado espa�o na mem�ria para o objeto que ser� criado
	// 2 - Cada atributo de classe � criado e inicializado com seus valores default ou valores explicitos
	// 3 - Bloco de inicializa��o � executado
	// 4 - O construtor � executado
	
	private static int[] parcelas;
	{
		System.out.println("Bloco de inicializa��o n�o estatico");
	}
	
	// Criando um bloco de inicializa��o
	static { // Bloco de inicializa��o estatico � executado apenas uma vez
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicializa��o estatico");
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
