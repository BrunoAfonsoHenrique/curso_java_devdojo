package estudosjava.Cintroducaometodos.sobrecargaconstrutores.teste;

import estudosjava.Cintroducaometodos.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante("1212", "Brunao", new double[] {5, 7, 9}, "24/12/2021");
		
		estudante.imprimirInformacoesEstudante();

	}

}
