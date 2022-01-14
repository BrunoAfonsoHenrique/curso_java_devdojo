package estudosjava.Cintroducaometodos.sobrecargametodos.classes;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	public Funcionario(String nome, String cpf, double salario, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}
	
	public Funcionario() {
		
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void imprimirDadosFuncionario() {
		System.out.println();
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.printf("Salario: R$%.2f" , this.salario);
		System.out.println("\nRG: " + this.rg);
	}
	
	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf =cpf;
		this.salario = salario;
	}
	
	
	public void init(String nome, String cpf, double salario, String rg) {
		init(nome, cpf, salario);
		this.rg = rg;
	}
}
