package estudosjava.Cintroducaometodos.teste;

import estudosjava.Cintroducaometodos.classes.Estudante2;

public class EstudanteTeste2 {

	public static void main(String[] args) {
		
		Estudante2 estudante = new Estudante2();
		
		estudante.setNome("Bruno Afonso");
		estudante.setIdade(-1);
		estudante.setNotas(new double[] {3,2,9,5}); 
		
		estudante.print();
		estudante.tirarMedia();
		
		System.out.println(estudante.getNome());
	}
		
}

