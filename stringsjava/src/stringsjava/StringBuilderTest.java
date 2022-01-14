package stringsjava;

//String Builder tem melhor performance
//String Builder não é uma string
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		String s = "Uma frase comum";
		StringBuilder sb = new StringBuilder(16); // 16 caracteres caso vc não passe o tamanho
		sb.append("Uma frase comum");
		sb.append(" test");
		System.out.println(sb);
		
		
		System.out.println("----------------------------------------");
		
		//System.out.println(sb.reverse());
		sb.append("0123456789");
		System.out.println(sb);
		System.out.println(sb.delete(0, 2));
		
		System.out.println(sb.insert(2, "####"));
		
	}
}
