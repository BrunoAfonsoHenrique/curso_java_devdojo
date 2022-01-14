package estudosjava.Fassociacao.exerciciosAssociacao.classes;

public class Seminario {
	
	private String titulo;
	private Aluno[] alunos;
	private Professor professores;
	private Local local;

	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public Seminario() {
		
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessores() {
		return professores;
	}

	public void setProfessores(Professor professores) {
		this.professores = professores;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	public void imprimirDados() {
		System.out.println("\n---------- Relatório de Seminários ----------");
		System.out.println("Titulo do seminario: " + this.titulo);
		System.out.println("Professor palestrante: " + this.professores.getNomeProfessor());
		
		if(this.local != null) {
			System.out.println("Local: Rua " + this.local.getRua() + " bairro " + this.local.getBairro());
		}else {
			System.out.println("Nenhum local cadastrado");
		}
		
		if(alunos != null && alunos.length != 0) {
			System.out.println("Alunos participantes ");
			for(Aluno aluno: alunos) {
				System.out.println(aluno.getNomeAluno());
			}
			return;
		}
		System.out.println("Nenhum aluno cadastrado");
		
	}
	
	
	
}
