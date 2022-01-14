package estudosjava.Gheranca.classes;

public class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	
	public Pessoa(String nome) {
		System.out.println("Dentro do construtor de pessoa");
		this.nome = nome;
	}
	
	public Pessoa(String nome, String cpf) {
		this(nome); // chamando o construtor da pr�pria classe
		this.cpf = cpf;
	}
	
	// Bloco de inicializa��o
	static {
		System.out.println("Bloco de inicializa��o estatico de pessoa");
	}
	
	{
		System.out.println("Bloco de inicializa��o de pessoa 1");
	}
	
	{
		System.out.println("Bloco de inicializa��o de pessoa 2");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void imprime() {
		System.out.println("------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereco: " + this.endereco.getRua());
	}
}
