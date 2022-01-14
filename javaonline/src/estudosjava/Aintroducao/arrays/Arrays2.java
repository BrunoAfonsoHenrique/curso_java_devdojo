package estudosjava.Aintroducao.arrays;

public class Arrays2 {

	public static void main(String[] args) {
		// <<< Valores de inicialização dos Arrays >>>
		//byte, short, int, long, float, double = 0
		//char = '\0000' espaco em branco
		//boolean = false
		//reference (Arrays de objetos) = null
		//String = null
		
		String[] nomes = new String[3];
		
		nomes[0] = "Bruno";
		nomes[1] = "Viviane";
		nomes[2] = "Jeferson";
		
		System.out.println("Tamanho do Array = " + nomes.length);
		
		// for normal
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		nomes = new String[4]; // muda a referencia para o espaço na memória

	}

}
