package exception.customexception;

public class CustomExceptionTest {

	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
		

	}
	
	public static void logar() throws LoginInvalidoException {
		
		String usuarioBancoDados = "Goku";
		String senhaBancoDados = "111";
		String usuarioDigitado = "Goku";
		String senhaDigitada = "123";
		if(!usuarioBancoDados.equals(usuarioDigitado) || !senhaBancoDados.equals(senhaDigitada)) {
			throw new LoginInvalidoException();
		} else {
			System.out.println("Logado");
		}
	}

}
