package estudosjava.Cintroducaometodos.classes;

public class Calculadora {
	
	public static void somaDoisNumeros() {
		System.out.println(5 + 5);
	}
	
	public static void subtrairDoisNumeros() {
		System.out.println(5 - 5);
	}
	
	public static void multiplicarDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static double dividirDoisNumeros(double num1, double num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		
		return 0;
	}
	
	public static void imprimeDoisNumerosDivididos(double num1, double num2) {
		if(num2 != 0) {
			System.out.println(num1 / num2);
			return; // dentro de um método VOID age como um break;
		}
			System.out.println("Impossível dividir por ZERO");
	}
	
	public static void alteraDoisNumeros(int num1, int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println("Dentro do altera dois numeros");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
	
	public static void somaArray(int[] numeros) {
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
	
	public static void somaVarArgs(int... numeros) { // (double valorDouble, int... numeros) 
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
}
