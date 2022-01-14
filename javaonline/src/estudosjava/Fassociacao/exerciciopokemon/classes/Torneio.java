package estudosjava.Fassociacao.exerciciopokemon.classes;

public class Torneio {
	
	private String nomeTorneio;
	private int quantidadeBatalhas;
	private int duracaoTorneio;
	private Treinador[] treinadores;
	private Local local;
	
	
	public Torneio(String nomeTorneio, int quantidadeBatalhas, int duracaoTorneio) {
		this.nomeTorneio = nomeTorneio;
		this.quantidadeBatalhas = quantidadeBatalhas;
		this.duracaoTorneio = duracaoTorneio;
	}

	public Torneio() {
	
	}

	public int getQuantidadeBatalhas() {
		return quantidadeBatalhas;
	}

	public void setQuantidadeBatalhas(int quantidadeBatalhas) {
		this.quantidadeBatalhas = quantidadeBatalhas;
	}

	public int getDuracaoTorneio() {
		return duracaoTorneio;
	}

	public void setDuracaoTorneio(int duracaoTorneio) {
		this.duracaoTorneio = duracaoTorneio;
	}

	public Treinador[] getTreinadores() {
		return treinadores;
	}

	public void setTreinadores(Treinador[] treinadores) {
		this.treinadores = treinadores;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	
	public String getNomeTorneio() {
		return nomeTorneio;
	}

	public void setNomeTorneio(String nomeTorneio) {
		this.nomeTorneio = nomeTorneio;
	}
	

	public void exibirDados() {
		System.out.println("\n----------------Dados do Torneio----------------");
		System.out.println("Nome do torneio: " + this.getNomeTorneio());
		System.out.println("Quantidade de batalhas do torneio: " + this.quantidadeBatalhas + " batalhas");
		System.out.println("Duração do torneio: " + this.duracaoTorneio + " dias");
		System.out.print("Nome do treinador pokemon: ");
		for(Treinador t: treinadores) {
			System.out.println(t.getNomeTreinador());
			
		}
		System.out.println("Local: " + this.local.getCidade() + 
				", Rua: " + this.local.getRua() + 
				", Bairro: " + this.local.getBairro());
		
	
	}
}
