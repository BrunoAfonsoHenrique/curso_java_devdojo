package estudosjava.Nexception.runtimeexception;

public class RuntimeExceptionTeste {

	public static void main(String[] args) {
		
		Object o = null; 
				
//		int a = 10;
//		int b = 0;
//		
//		if(b != 0) {
//			int c = a / b;
//			System.out.println(c);
//		}
		
		try {
			int[] a = new int[2];
			System.out.println(a[2]);
			System.out.println("Imprimindo depois da possível exceção");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fora do Try - catch");
		
		
//		System.out.println(o.toString());

	}

}
