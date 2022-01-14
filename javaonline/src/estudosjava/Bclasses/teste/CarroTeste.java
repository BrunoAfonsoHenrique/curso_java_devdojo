package estudosjava.Bclasses.teste;

import estudosjava.Bclasses.classeestudos.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.velocidadeMaxima = 120.0F;
		carro.modelo = "Tesla";
		carro.placa = "XXX9825";
		
		System.out.println(carro.velocidadeMaxima);
		System.out.println(carro.modelo);
		System.out.println(carro.placa);
		

	}

}
