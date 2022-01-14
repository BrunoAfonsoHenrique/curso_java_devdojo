package resourcebundle.test;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class ResourceBundleTest {

	public static void main(String[] args) {
		
		System.out.println(Locale.getDefault());
		try {
			ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
		} catch(MissingResourceException e) {
			System.out.println("ERRO" );
		}
		//ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
		//System.out.println(rb.getString("hello"));
		//System.out.println(rb.getString("good.morning"));
	}

}
