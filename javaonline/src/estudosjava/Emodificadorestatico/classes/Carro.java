package estudosjava.Emodificadorestatico.classes;

public class Carro {
	
	// velocidade limite deve ser 240km/h
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240.00; // Atributos com static pertencem a classe e n�o ao objeto
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Carro() {
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}

	public void imprimirDadosCarro() {
		System.out.println("Nome do carro: " + this.nome);
		System.out.println("Velocidade m�xima: " + this.velocidadeMaxima);
		System.out.println("Velocidade limite: " + velocidadeLimite);
		System.out.println("----------------------------------");
	}
	
	// N�o se pode acessar atributos n�o estaticos de m�todos estaticos
	
	// Regra geral: Pode usar o static nos m�todos se n�o esta acessando atributos de classe
}
