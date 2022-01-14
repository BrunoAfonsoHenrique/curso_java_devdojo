package runtimeexception;

public class RuntimeExceptionTest {

	public static void main(String[] args) {

		/*
		 * Object o = null;
		 * 
		 * int a = 10; int b = 0;
		 * 
		 * if (b != 0) { int c = a / b;
		 * 
		 * System.out.println(a); }
		 * 
		 * System.out.println(o.toString());
		 * 
		 * try { int[] lista = new int[2]; 
		 * 	System.out.println(lista[2]);
		 * 	System.out.println("Imprimindo depois da possível excecao"); 
		 * } catch
		 * (ArrayIndexOutOfBoundsException e) { 
		 * 	e.printStackTrace();
		 * 
		 * }
		 * 
		 * System.out.println("Fora do bloco catch");
		 * 
		 * }
		 */
		
		try {
			divisao(10, 0);
		}catch(RuntimeException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}
	
	private static void divisao(int num1, int num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException("Passe um valor diferente de zero para o num2");
		}
		double result = num1 / num2;
		System.out.println(result);
	}
	

}
