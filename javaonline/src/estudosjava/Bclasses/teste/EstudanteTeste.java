package estudosjava.Bclasses.teste;

import estudosjava.Bclasses.classeestudos.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		
		estudante.nome = "Bruno";
		estudante.matricula = 1212;
		estudante.idade = 26;
		
		System.out.println(estudante.nome);
		System.out.println(estudante.matricula);
		System.out.println(estudante.idade);
	}

}
