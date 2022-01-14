package estudosjava.Aintroducao.arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// <<< Valores de inicialização dos Arrays >>>
		//byte, short, int, long, float, double = 0
		//char = '\0000' espaco em branco
		//boolean = false
		//reference (Arrays de objetos) = null
		//String = null
		
		int[] idades = new int[3]; // Sintaxe mais recomendada
		idades[0] = 20;
		idades[1] = 15;
		idades[2] = 30;
		System.out.println("idade 1: " + idades[0]);
		System.out.println("idade 2: " + idades[1]);
		System.out.println("idade 3: " + idades[2]);

	}

}
