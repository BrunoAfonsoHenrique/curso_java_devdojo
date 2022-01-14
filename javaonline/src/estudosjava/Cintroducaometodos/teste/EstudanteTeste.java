package estudosjava.Cintroducaometodos.teste;

import estudosjava.Cintroducaometodos.classes.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		
		estudante.nome = "Bruno";
		estudante.idade = 26;
		estudante.notas[0] = 5.0;
		estudante.notas[1] = 7.8;
		estudante.notas[2] = 10.0;
		
		estudante.calcularMediaAluno();

	}

}
