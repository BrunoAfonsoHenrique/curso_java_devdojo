package assertivas;

public class AssertivasTeste {

	public static void main(String[] args) {

		calcularSalario(-2000);
		diasDaSemana(9);

	}

	private static void calcularSalario(double salario) { // m�todo privado
		assert (salario > 0) : "O sal�rio n�o deve ser menor que 0";
		// Significa --> Esse valor tem que ser true. Tenho certeza absoluta que o
		// salario � maior que zero
		// Dentro do assert � como se fosse um if, aceitando um valor booleano

//		if(salario > 0) {
//			//fazer calculo
//		}
//		else {
//			System.out.println("Se chegou aqui, ferrou !!!!");
//		}
	}

	public static void calcSalario(double salario) { // m�todo publico
		if (salario < 0) {
			throw new IllegalArgumentException();
		}
	}

	public static void diasDaSemana(int dia) { // m�todo publico
		switch (dia) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			default: assert false;
		}
	}
}
