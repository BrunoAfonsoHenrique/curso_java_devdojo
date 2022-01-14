package estudosjava.Fassociacao.exerciciopokemon.classes;

public class Treinador {

	private String nomeTreinador;
	private int idadeTreinador;
	private Torneio torneio;
	private Pokemon[] pokemons;

	public Treinador(String nomeTreinador, int idadeTreinador) {
		this.nomeTreinador = nomeTreinador;
		this.idadeTreinador = idadeTreinador;
	}

	public Treinador() {

	}

	public String getNomeTreinador() {
		return nomeTreinador;
	}

	public void setNomeTreinador(String nomeTreinador) {
		this.nomeTreinador = nomeTreinador;
	}

	public int getIdadeTreinador() {
		return idadeTreinador;
	}

	public void setIdadeTreinador(int idadeTreinador) {
		this.idadeTreinador = idadeTreinador;
	}

	public Torneio getTorneio() {
		return torneio;
	}

	public void setTorneio(Torneio torneio) {
		this.torneio = torneio;
	}

	public Pokemon[] getPokemons() {
		return pokemons;
	}

	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}

	public void exibirDados() {
		System.out.println("\n----------------Dados do treinador Pokemon----------------");
		System.out.println("Nome do treinador pokemon: " + this.nomeTreinador);
		System.out.println("Idade do treinador pokemon: " + this.idadeTreinador);
		if (torneio != null) {
			System.out.println("Nome do torneio que esta participando: " + this.torneio.getNomeTorneio());
		} else {
			System.out.println("Treinador não esta inscrito em nenhum torneio.");
		}
		
		if(pokemons != null && pokemons.length != 0) {
			for(Pokemon pokes: pokemons) {
				System.out.println("Nome do pokemon: " + pokes.getNomePokemon());
				System.out.println("Tipo de pokemon: " + pokes.getTipoPokemon() + " e nivel de poder: " + pokes.getNivelPoderPokemon());
			}
		}

	}
}
