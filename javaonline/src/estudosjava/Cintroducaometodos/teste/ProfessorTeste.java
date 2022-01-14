package estudosjava.Cintroducaometodos.teste;

import estudosjava.Cintroducaometodos.classes.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		Professor prof = new Professor();
		
		prof.cpf = "122.222.232-20";
		prof.matricula = "111222";
		prof.nome = "Marcos";
		prof.rg = "122211-5";
		
		Professor prof2 = new Professor();
		prof2.cpf = "133.333.444-61";
		prof2.matricula = "333444";
		prof2.nome = "Viviane";
		prof2.rg = "23335-8";
		
		prof.imprime();
		prof2.imprime();
		
		
		// variaveis de tipo primitivo --> Passa cópia dos valores
	}

}
