package Tdatas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
	
	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		
		// ISO 639 pt = portugues BR = Brasil, en = ingles, US - Estados Unidos
		Locale localItalia = new Locale("it"); // Italia
		Locale localSuica = new Locale("it", "CH"); // italiano da Suiça
		Locale localIndia = new Locale("hi", "IN"); // India
		Locale localJapao = new Locale("ja"); // Japão
		
		
		Calendar c = Calendar.getInstance();
		//c.set(2023, Calendar.DECEMBER, 24); --> Tirando isso, você pega a data atual
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localItalia);
		System.out.println("Italia " + df.format(c.getTime()));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localSuica);
		System.out.println("Suiça " + df2.format(c.getTime()));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
		System.out.println("India " + df3.format(c.getTime()));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
		System.out.println("Japão " + df3.format(c.getTime()));
		
		
		System.out.println(localItalia.getDisplayLanguage());
		System.out.println(localJapao.getDisplayLanguage(localItalia)); // Japão em italiano
		
		System.out.println(localSuica.getDisplayCountry(localItalia)); // Suiça em italiano
		
	}
}
