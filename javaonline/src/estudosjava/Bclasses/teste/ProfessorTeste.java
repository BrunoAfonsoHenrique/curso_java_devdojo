package estudosjava.Bclasses.teste;

import estudosjava.Bclasses.classeestudos.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		
		professor.nome = "Caio Ribeiro";
		professor.matricula = "1212";
		professor.cpf = "11111111111";
		professor.rg = "222222222";
		
		System.out.println(professor.nome);
		System.out.println(professor.matricula);
		System.out.println(professor.cpf);
		System.out.println(professor.rg);
		
		System.out.println("---------------------------------------");
		Professor professor2 = new Professor();
		
		professor2.nome = "Jeferson Aparecido";
		professor2.matricula = "2929";
		professor2.cpf = "33333333333";
		professor2.rg = "555555555";
		
		professor = professor2; // professor vai referenciar o mesmo objeto de professor2
		//variavel de referencia, vai referenciar o objeto
		
		System.out.println(professor.nome);
		System.out.println(professor.matricula);
		System.out.println(professor.cpf);
		System.out.println(professor.rg);
		

	}

}
