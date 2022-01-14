package estudosjava.Cintroducaometodos.classes;

public class Estudante2 {
	
	private String nome;
	private int idade;
	private double[] notas;
	private boolean aprovado;
	
	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		if(notas != null) {
			for(double nota : this.notas) {
				System.out.println(nota + " ");
			}
		}
	}
	
	public void tirarMedia() {
		if(this.notas == null) {
			System.out.println("Esse aluno não possui notas");
			return;
		}
		
		double media = 0;
		for(double nota : this.notas) {
			media += nota;
		}
		
		media = media / this.notas.length;
		
		if(media > 6) {
			this.aprovado = true;
			System.out.println("Situação: " + this.getAprovado());
		} else {
			this.aprovado = false;
			System.out.println("Situação: " + this.getAprovado());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public boolean getAprovado() {
		return aprovado;
	}
	
}
