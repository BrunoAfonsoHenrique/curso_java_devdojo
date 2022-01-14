package estudosjava.Fassociacao.exerciciosAssociacao.classes;

public class Professor {

	private String nomeProfessor;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor(String nomeProfessor, String especialidade) {
		this.nomeProfessor = nomeProfessor;
		this.especialidade = especialidade;
	}

	public Professor() {
		this.nomeProfessor = nomeProfessor;
		this.especialidade = especialidade;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public void imprimirDados() {
		System.out.println("\n---------- Relatório do professor ----------");
		System.out.println("Nome professor: " + this.nomeProfessor);
		System.out.println("Especialidade: " + this.especialidade);
		if (seminarios != null && seminarios.length != 0) {
			System.out.println("Seminarios participantes: ");
			for (Seminario sem : seminarios) {
				System.out.println(sem.getTitulo() + " ");
			}
			return;
		}
		System.out.println("Professor não vinculado a nenhum seminario");
		
	}

}
