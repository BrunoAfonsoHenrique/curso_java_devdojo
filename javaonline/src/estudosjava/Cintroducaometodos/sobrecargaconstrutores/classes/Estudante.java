package estudosjava.Cintroducaometodos.sobrecargaconstrutores.classes;

public class Estudante {
	
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;
	
	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		this(matricula, nome, notas); // Chamando outro construtor
		this.dataMatricula = dataMatricula;
	}
	
	public Estudante() {
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public void imprimirInformacoesEstudante() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		for(double numeros : this.notas) {
			System.out.printf("%.2f\n", numeros);
		}
		System.out.println("Data matricula: " + this.dataMatricula);
	}
}
