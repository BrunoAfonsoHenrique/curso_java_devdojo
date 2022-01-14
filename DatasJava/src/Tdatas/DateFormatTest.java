package Tdatas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		DateFormat[] dataFormatada = new DateFormat[6];
		dataFormatada[0] = DateFormat.getInstance();
		dataFormatada[1] = DateFormat.getDateInstance();
		dataFormatada[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dataFormatada[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dataFormatada[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dataFormatada[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat data : dataFormatada) {
			System.out.println(data.format(c.getTime()));
		}
		
	}

}
