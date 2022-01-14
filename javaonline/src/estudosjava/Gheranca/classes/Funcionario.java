package estudosjava.Gheranca.classes;

public class Funcionario extends Pessoa{
	
	private double salario;
	
	static {
		System.out.println("Bloco de inicializa��o static do funcionario 1");
	}
	
	{
		System.out.println("Bloco de inicializa��o do funcionario 1");
	}
	
	{
		System.out.println("Bloco de inicializa��o do funcionario 2");
	}
	
	
	
	public Funcionario(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de um parametro de Funcionario");
	}
	
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	public void imprime() {
		super.imprime();
		System.out.println("Salario: R$" + this.salario);
		imprimeReciboPagamento();
	}
	
	public void imprimeReciboPagamento() {
		System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
	}

}
