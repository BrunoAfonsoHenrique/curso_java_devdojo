package estudosjava.Cintroducaometodos.sobrecargametodos.teste;

import estudosjava.Cintroducaometodos.sobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Bruno", "111.111.111-11", 300.000, "11.111.111-1");
		Funcionario funcionario2 = new Funcionario();
		
		//funcionario.inicializaoDados("Caio Castro", "111.111.111-11", 300.000);
		funcionario.imprimirDadosFuncionario();
		funcionario2.imprimirDadosFuncionario();
	}

}
