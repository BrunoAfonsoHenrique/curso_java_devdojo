package estudosjava.Cintroducaometodos.classes;

public class Estudante {
	
	public String nome;
	public int idade;
	public double[] notas = new double[3];
	
	public void calcularMediaAluno() {
		double media = 0;
		for(double num: notas) {
			media += media;
		}
		media = media / notas.length;
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		if(media > 6) {
			System.out.println("Situação do aluno: Aprovado");
		}else {
			System.out.println("Situação do aluno: Reprovado");
		}
	}
}
