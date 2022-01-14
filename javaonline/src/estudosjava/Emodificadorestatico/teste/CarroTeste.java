package estudosjava.Emodificadorestatico.teste;

import estudosjava.Emodificadorestatico.classes.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro.setVelocidadeLimite(220);
		System.out.println(Carro.getVelocidadeLimite());
		
		
		
//		Carro carro1 = new Carro("BMW", 280);
//		Carro carro2 = new Carro("Audi", 285);
//		Carro carro3 = new Carro("Mercedes", 290);
//		
//		carro1.imprimirDadosCarro();
//		carro2.imprimirDadosCarro();
//		carro3.imprimirDadosCarro();
//		
//		System.out.println("######################################\n");
//		
//		Carro.setVelocidadeLimite(220);
//		
//		carro1.imprimirDadosCarro();
//		carro2.imprimirDadosCarro();
//		carro3.imprimirDadosCarro();

	}

}
