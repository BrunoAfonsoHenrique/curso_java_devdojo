package estudosjava.Linterfaces.classes;

import estudosjava.Linterfaces.interfaces.Transportavel;
import estudosjava.Linterfaces.interfaces.Tributavel;

public class Produto implements Tributavel, Transportavel {

	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double valorFrete;
	

	public Produto() {
		
	}
	
	
	
	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}



	@Override
	public void calcularImposto() { // Interface Tributavel
		precoFinal = this.preco + (this.preco * IMPOSTO);
	}

	@Override
	public void calcularFrete() { // Interface Transportavel
		valorFrete = this.preco / peso * 0.1;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

	public double getPrecoFinal() {
		return precoFinal;
	}


	public double getValorFrete() {
		return valorFrete;
	}



	@Override
	public String toString() {
		return "Produto [nome = " + nome + 
				", peso = " + peso + 
				", preco = " + preco + 
				", precoFinal com imposto = " + precoFinal + 
				", valorFrete = " + valorFrete + "]";
	}

	
	
	
}
