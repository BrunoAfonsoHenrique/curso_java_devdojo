package estudosjava.Fassociacao.exerciciopokemon.classes;


public class Pokemon {
	
	private String nomePokemon;
	private String tipoPokemon;
	private int nivelPoderPokemon;
	private Treinador treinador;
	
	
	public Pokemon(String nomePokemon, String tipoPokemon, int nivelPoderPokemon) {
		
		this.nomePokemon = nomePokemon;
		this.tipoPokemon = tipoPokemon;
		this.nivelPoderPokemon = nivelPoderPokemon;
	}
	
	public Pokemon() {
		
	}

	public String getNomePokemon() {
		return nomePokemon;
	}

	public void setNomePokemon(String nomePokemon) {
		this.nomePokemon = nomePokemon;
	}

	public String getTipoPokemon() {
		return tipoPokemon;
	}

	public void setTipoPokemon(String tipoPokemon) {
		this.tipoPokemon = tipoPokemon;
	}

	public int getNivelPoderPokemon() {
		return nivelPoderPokemon;
	}

	public void setNivelPoderPokemon(int nivelPoderPokemon) {
		this.nivelPoderPokemon = nivelPoderPokemon;
	}

	public Treinador getTreinador() {
		return treinador;
	}

	public void setTreinador(Treinador treinador) {
		this.treinador = treinador;
	}
	
	
	public void exibirDados() {
		System.out.println("\n----------------Dados do Pokemon----------------");
		System.out.println("Nome do pokemon: " + this.nomePokemon);
		System.out.println("Nivel de poder do pokemon: " + this.nivelPoderPokemon);
		
	}

}
