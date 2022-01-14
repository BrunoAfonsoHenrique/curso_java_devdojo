package estudosjava.Dblocoinicializacao.teste;

import estudosjava.Dblocoinicializacao.classe.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		System.out.println("Exibindo a quantidade de parcelas possíveis");
		for(int parcela : cliente.getParcelas()) {
			System.out.print(parcela + " ");
		}

	}

}
