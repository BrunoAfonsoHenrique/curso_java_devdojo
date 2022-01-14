package assertivas;

public class AssertivasTeste {

	public static void main(String[] args) {

		calcularSalario(-2000);
		diasDaSemana(9);

	}

	private static void calcularSalario(double salario) { // método privado
		assert (salario > 0) : "O salário não deve ser menor que 0";
		// Significa --> Esse valor tem que ser true. Tenho certeza absoluta que o
		// salario é maior que zero
		// Dentro do assert é como se fosse um if, aceitando um valor booleano

//		if(salario > 0) {
//			//fazer calculo
//		}
//		else {
//			System.out.println("Se chegou aqui, ferrou !!!!");
//		}
	}

	public static void calcSalario(double salario) { // método publico
		if (salario < 0) {
			throw new IllegalArgumentException();
		}
	}

	public static void diasDaSemana(int dia) { // método publico
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
