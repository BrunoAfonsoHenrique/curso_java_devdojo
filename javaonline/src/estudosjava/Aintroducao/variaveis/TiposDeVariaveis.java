package estudosjava.Aintroducao.variaveis;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		
		int idadee = 10;
		double salarioDouble = 3000;
		float salarioFloat= 3000;
		byte idadeByte = 12;
		short idadeshort = 32767;
		boolean verdadeiro = true;
		boolean falso = false;
		long numeroGrande = 1000L;
		char caractere = 'A'; // 2bytes
		
		/*
		 * Crie um algoritmo que possua variaveis para
		 * salvar os seguintes dados:
		 * Nome;
		 * Endere�o;
		 * Telefone
		 * 
		 */
		
		String nomePessoa = "Bruno Afonso";
		String enderecoPessoa = "Rua XXX n 140, CEP: XXXXX-XX, S�o Paulo - SP";
		String telefonePessoa = "11 91111-1111";
		
		System.out.println("O " + nomePessoa + " domiciliado no endere�o " + 
				enderecoPessoa + "\ne telefone " + telefonePessoa + 
				" n�o possui nenhum tipo de pendencia.");
		
		System.out.println("\n------------------------------------------------------\n");
		
		String nome = "Jeferson";
		float salario = 5000;
		char sexo = 'M';
		int idade = 30;
		String estadoCivil = "casado";
		
		System.out.println("O trabalhador(a) " + nome + " do sexo " + sexo +
				", idade " + idade + ", estado civil " + estadoCivil +
				"\ne salario de " + salario + " encontra-se empregado neste estabelecimento");
		
		System.out.println("\n------------------------------------------------------\n");
		

	}

}
