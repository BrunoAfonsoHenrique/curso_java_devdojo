package estudosjava.Dblocoinicializacao.classe;

public class Cliente {
	
	// 1 - Alocado espa�o na mem�ria para o objeto que ser� criado
	// 2 - Cada atributo de classe � criado e inicializado com seus valores default ou valores explicitos
	// 3 - Bloco de inicializa��o � executado
	// 4 - O construtor � executado
	
	private int[] parcelas;
	
	// Criando um bloco de inicializa��o
	{
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicializa��o");
		for(int i = 1; i <= 100; i++) {
			parcelas[i - 1] = i;
		}
	}
	
	public Cliente() {
		
	}

	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
	
	
	
	
}
