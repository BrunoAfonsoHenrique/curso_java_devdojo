package Tdatas;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
	
	public static void main(String[] args) {
		
		Date date = new Date(); // A data é armazenada em ms
		System.out.println(date.getTime() + 3_600_000L);
		System.out.println(date);
		
		
		Calendar c = Calendar.getInstance();
		//c.setTime(date);
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Domingo é o primeiro dia da semana");
		}
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		
		//Adicionar uma hora
		c.add(Calendar.HOUR, 24);
		c.roll(Calendar.MONTH, 9);
		Date date2 = c.getTime();
		System.out.println(date2);
		
		// Essas 5 classes você vai utilizar quando for trabalhar com numeros, datas e moedas
		//NumberFormat
		//Locale
		//Calendar
		//Date
		//DateFormat
		
	}
}
