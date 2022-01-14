package estudosjava.Emodificadorestatico.teste;

import estudosjava.Emodificadorestatico.classes.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		System.out.println("Exibindo a quantidade de parcelas possíveis");
//		for(int parcela : cliente.getParcelas()) {
//			System.out.print(parcela + " ");
//		}
		
		System.out.println("Tamanho: " + cliente.getParcelas().length);

	}

}
