package estudosjava.Fassociacao.exerciciopokemon.teste;

import estudosjava.Fassociacao.exerciciopokemon.classes.Local;
import estudosjava.Fassociacao.exerciciopokemon.classes.Pokemon;
import estudosjava.Fassociacao.exerciciopokemon.classes.Torneio;
import estudosjava.Fassociacao.exerciciopokemon.classes.Treinador;
import estudosjava.Fassociacao.exerciciosAssociacao.classes.Seminario;

public class TorneioPokemonTeste {

	public static void main(String[] args) {
		
		Treinador treinador1 = new Treinador("Ash Kation", 19);
		Pokemon pokemon1 = new Pokemon("Pikachu", "Elétrico", 6);
		Torneio torneio = new Torneio("Torneio dos lendarios", 58, 30);
		Local local = new Local("Rio de Janeiro", "Rua dos champions", "Poder poderoso");
		
		treinador1.setTorneio(torneio);
		treinador1.setPokemons(new Pokemon[] {pokemon1});
		treinador1.exibirDados();
		//treinador1.exibirDados();
		
		pokemon1.exibirDados();
		
		torneio.setLocal(local);
		torneio.setTreinadores(new Treinador[] {treinador1});
		
		
		
		local.exibirDados();
		torneio.exibirDados();
		
		
			

	}

}
