package estudosjava.Mpolimorfismo.classes;

import estudosjava.Mpolimorfismo.Interface.GenericDAO;

public class DatabaseDAOImplementacao implements GenericDAO{

	@Override
	public void save() {
		System.out.println("Salvando dados no banco de dados");
		
	}

}
