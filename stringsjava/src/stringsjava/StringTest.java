package stringsjava;

public class StringTest {

	public static void main(String[] args) {
		
		String nome = "Bruno"; // Mais performatico -> Linha 7
		//String sobrenome = new String(" Afonso");
		
		nome = nome.concat(" Henrique"); // nome += " Henrique";
		String nome2 = "Bruno";
		String nome3 = new String("Catarina"); // 1 -  variavel de referencia, 2 - um objeto do tipo String, 3 - Uma String no pool de Strings
		
		String teste = "Goku";
		String teste2 = "   goku   ";
		
		System.out.println(teste.charAt(3));
		System.out.println("--------------------------- Dentro do TryCatch -----------------");
		try {
			System.out.println(teste.charAt(4));
		}
		catch(RuntimeException e) {
			System.out.println("Você está tentando acessar uma posição fora do range: " + e.getMessage());
		}
		
		System.out.println("-----------------------------  Fim do TryCatch  -----------------");
		
		System.out.println(teste.equals(teste2));
		System.out.println(teste.equalsIgnoreCase(teste2));
		System.out.println(teste.length());
		System.out.println(teste.replace('o', 'a'));
		System.out.println(teste.toLowerCase());
		System.out.println(teste.toUpperCase());
		System.out.println(teste.substring(0,2)); // pegar uma parte da string --> Ex: pega de 0 a 1, (0,5) --> pega de 0 a 4
		System.out.println(teste2);
		System.out.println(teste2.trim()); // tiras os espaços do começo e do fim da string
		

	}

}
