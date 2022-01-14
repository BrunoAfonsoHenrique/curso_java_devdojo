package tokentest;

public class TokenTeste {

	public static void main(String[] args) {
		
//		Maneira mais simples
		String str = "William, Paulo, Joana, Camila, Anna, John, Matheus";
		String[] tokens = str.split(",");
		for(String arr : tokens) {
			System.out.println(arr.trim());
		}
		
		

	}

}
