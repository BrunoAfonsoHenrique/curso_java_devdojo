package runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {

	public static void main(String[] args) {
		
		try {
			// throw new ArrayIndexOutOfBoundsException();
			// throw new IllegalArgumentException();
			// throw new ArithmeticException();
			throw new RuntimeException();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Dentro do IllegalArgumentException");
		}
		catch(RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
			
		}
		
		System.out.println("Final do programa");
		
		try {
			talvezLanceException();
		}
		catch(Exception e) { // isso é a mesma coisa que ter 2 catch : | --> OU
			//e = new SQLException();
		}
		

	}
	
	private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException{
		
	}

}
