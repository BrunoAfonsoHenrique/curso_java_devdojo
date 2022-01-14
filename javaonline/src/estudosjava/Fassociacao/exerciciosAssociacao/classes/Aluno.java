package estudosjava.Fassociacao.exerciciosAssociacao.classes;

public class Aluno {
	
	private String nomeAluno;
	private int idade;
	private Seminario seminario;
	
	public Aluno(String nomeAluno, int idade) {

		this.nomeAluno = nomeAluno;
		this.idade = idade;
	}
	
	public Aluno() {
		
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	
	public void imprimirDados() {
		System.out.println("\n---------- Alunos participantes ----------");
		System.out.println("Nome aluno: " + this.nomeAluno);
		System.out.println("Idade aluno: " + this.idade);
		if(seminario != null) {
			System.out.println("Seminario inscrito: " + this.seminario.getTitulo());
	
		} else {
			System.out.println("Aluno não esta incrito em nenhum seminario");
		}	
	}
	
	
}
