package estudosjava.Kclassesabstratas.classes;

public abstract class Funcionario extends Pessoa{
	
	protected boolean clt;
	protected double salario;
	
	
	
	public Funcionario() {
		
	}
	
	

	public Funcionario(String nome, boolean clt, double salario) {
		
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}



	public abstract void calcularSalario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isClt() {
		return clt;
	}
	public void setClt(boolean clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}



	@Override
	public String toString() {
		return "Funcionario [nome = " + nome + 
				", clt = " + clt + 
				", salario = " + salario + "]"; 
	}
	
	
	
	
}
