package estudosjava.Cintroducaometodos.teste;

import estudosjava.Cintroducaometodos.classes.Calculadora;

public class calculadoraTeste {

	public static void main(String[] args) {
		
		//Calculadora calculadora = new Calculadora();
		
		Calculadora.somaDoisNumeros(); // Soma
		System.out.println("Continuando a execu��o...");
		
		Calculadora.subtrairDoisNumeros(); // Subtra��o
		System.out.println("Continuando a execu��o...");
		
		Calculadora.multiplicarDoisNumeros(8, 5); // Multiplica��o
		System.out.println("Continuando a execu��o...");
		
		double resultado = Calculadora.dividirDoisNumeros(20, 0); // Divisao
		System.out.println(resultado);
		System.out.println("Continuando a execu��o...");
		
		System.out.println("imprimeDoisNumerosDivididos");
		Calculadora.imprimeDoisNumerosDivididos(20, 4);
		
		System.out.println("Passagem de multiplos elementos como parametros");
		int[] numeros = {1,2,3,4,5};
		Calculadora.somaArray(numeros);
		
		System.out.println("Soma VarArgs");
		int[] nums= {1,2,3,4,5};
		Calculadora.somaArray(nums);
		Calculadora.somaVarArgs(1,2,3,4,5);
		
	}

}
