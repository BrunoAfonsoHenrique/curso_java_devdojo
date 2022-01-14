package estudosjava.Aintroducao.arrays;

public class Arrays3 {

	public static void main(String[] args) {
		
		// <<< Valores de inicialização dos Arrays >>>
		//byte, short, int, long, float, double = 0
		//char = '\0000' espaco em branco
		//boolean = false
		//reference (Arrays de objetos) = null
		//String = null
		
		int[] numeros = new int[10];
		int[] numeros1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numeros2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros1[i]);
		}
		
		System.out.println("-----------------------------------------------");
		
		//for each // Muito usado em coleções
		for(int num: numeros1) {
			System.out.println("Numero: " + num);
		}
		
	}

}
