package Tdatas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		String mascara = "'S�o Paulo,' dd 'de' MMMM 'de' yyyy";
		SimpleDateFormat formatador = new SimpleDateFormat(mascara); // Criar formata��o de data personalizada
		System.out.println(formatador.format(c.getTime()));
		
	}

}
