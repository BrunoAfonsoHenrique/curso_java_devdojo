package estudosjava.Mpolimorfismo.teste;

import java.util.ArrayList;
import java.util.List;

import estudosjava.Mpolimorfismo.Interface.GenericDAO;
import estudosjava.Mpolimorfismo.classes.DatabaseDAOImplementacao;

public class DaoTeste {

	public static void main(String[] args) {
		
		GenericDAO arquivoDAO =  new DatabaseDAOImplementacao();
		arquivoDAO.save();
		List<String> lista = new ArrayList<>(); // ou new LinkedList<>();
		lista.add("Nome1");
		lista.add("Nome2");
		lista.add("Nome3");
		lista.add("Nome4");
		
		for(String l : lista) {
			System.out.println(l);
		}

	}

}
