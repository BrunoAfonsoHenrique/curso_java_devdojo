package checkedexception.teste;

import java.io.FileNotFoundException;

import checkedexception.classes.Funcionario;
import checkedexception.classes.Pessoa;
import exception.customexception.LoginInvalidoException;

public class SobrescritaComExceptionsTest {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario();
		Pessoa pessoa = new Pessoa();
		
		try {
			pessoa.salvar();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (LoginInvalidoException e) {
			
			e.printStackTrace();
		}
	}

}
