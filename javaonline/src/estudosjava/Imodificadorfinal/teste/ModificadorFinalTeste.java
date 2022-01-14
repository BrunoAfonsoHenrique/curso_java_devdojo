package estudosjava.Imodificadorfinal.teste;

import estudosjava.Imodificadorfinal.classes.Carro;

public class ModificadorFinalTeste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		System.out.println(carro.getComprador());
		
		carro.getComprador().setNome("Goku");
		
		System.out.println(carro.getComprador());
		
	}

}
