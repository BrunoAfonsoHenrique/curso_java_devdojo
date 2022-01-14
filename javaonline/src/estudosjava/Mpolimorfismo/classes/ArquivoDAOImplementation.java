package estudosjava.Mpolimorfismo.classes;

import estudosjava.Mpolimorfismo.Interface.GenericDAO;

public class ArquivoDAOImplementation implements GenericDAO{

	@Override
	public void save() {
		System.out.println("Salvando dados nos arquivos");
		
	}

}
