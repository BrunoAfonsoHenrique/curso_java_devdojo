package internacionalizacaonumeros;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		
		float valor = 212.4567F;
		Locale localFranca = new Locale("fr");
		
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(localFranca);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(localFranca);
		
		for(NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		nf.setMaximumFractionDigits(1);
		System.out.println(nf.format(valor));
		
		String valorString = "212.4567";
		try {
			System.out.println(nf.parse(valorString));
			nf.setParseIntegerOnly(true); // Desconsidera os valores decimais
			System.out.println(nf.parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
