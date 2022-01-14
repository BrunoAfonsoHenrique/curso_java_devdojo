package estudosjava.Fassociacao.exerciciopokemon.classes;

public class Local {
	
	String cidade;
	String rua;
	String bairro;
	
	public Local(String cidade, String rua, String bairro) {
		this.cidade = cidade;
		this.rua = rua;
		this.bairro = bairro;
	}
	
	public Local() {

	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
		
	public void exibirDados() {
		System.out.println("\n----------------Dados do Local----------------");
		System.out.println("Local: " + this.cidade);
		System.out.println("Rua: " + this.rua);
		System.out.println("Bairro: " + this.bairro);
	}
}
