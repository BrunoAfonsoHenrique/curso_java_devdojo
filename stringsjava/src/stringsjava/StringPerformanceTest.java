package stringsjava;

public class StringPerformanceTest {
	
	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		concatString(30000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto String: " + (fim - inicio) + "ms");
		
		
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(200000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + "ms");
		
		
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(200000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuffer: " + (fim - inicio) + "ms");
	}
	
	
	
	//String
	private static void concatString(int tamanho) {
		String string = "";
		
		for(int i = 0; i < tamanho; i++) {
			string += i;
		}
	}
	
	
	// StringBuilder
	private static void concatStringBuilder(int tamanho) { // muito mais rápido
		StringBuilder st = new StringBuilder(tamanho);
		
		for(int i = 0; i < tamanho; i++) {
			st.append(i);
		}
	}
	
	
	//StringBuffer
	private static void concatStringBuffer(int tamanho) { // métodos protegidos a acesso de multiplas Threads
		StringBuffer st = new StringBuffer(tamanho);
		
		for(int i = 0; i < tamanho; i++) {
			st.append(i);
		}
	}
}
