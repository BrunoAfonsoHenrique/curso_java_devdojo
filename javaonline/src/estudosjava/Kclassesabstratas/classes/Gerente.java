package estudosjava.Kclassesabstratas.classes;

public class Gerente extends Funcionario{

	public Gerente(String nome, boolean clt, double salario) {
		super(nome, clt, salario);
		
	}

	public Gerente() {
		super();
		
	}
	
	@Override
	public void calcularSalario() {
		this.salario = salario + (salario * 0.2);
	}
	
	@Override
	public void imprime() {
		
	}
	
}
