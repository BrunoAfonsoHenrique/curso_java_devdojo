package wrappers;

// Classes utilitárias
public class WrappersTest {
	
	public static void main(String[] args) {
		
		/**
		 * 8 tipos primitivos de variáveis
		 * 
		 * byte bytePrimitivo = 1;
		 * short shortPrimitivo = 1;
		 * int intPrimitivo = 10;
		 * long longPrimitivo = 10;
		 * float floatPrimitivo = 10L;
		 * double doublePrimitivo = 10D;
		 * 
		 * char charPrimitivo = 'A';
		 * boolean booleanPrimitivo = true;
		 */
		
		// Wrapper 
		Byte byteWarapper = 1;
		Short shortWrapper = 1;
		Integer integerWrapper = Integer.valueOf(10);
		// Long longWrapper = 10L; //autoboxing
		Long longWrapper = Long.valueOf(10L);
		Float floatWrapper = Float.valueOf(26);
		Double doubleWrapper = 10D;
		Character characterWrapper = 'A';
		Boolean booleanWrapper = Boolean.valueOf(true);
		
		String valor = "10";
		Float f = Float.parseFloat(valor); // método parse
		System.out.println(f);
		
		
		System.out.println(booleanWrapper);
		System.out.println("-----------------------------------");
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetterOrDigit('#'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('B'));
		System.out.println(Character.toUpperCase('l'));
	}
	
}
