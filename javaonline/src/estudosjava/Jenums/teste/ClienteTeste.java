package estudosjava.Jenums.teste;

import estudosjava.Jenums.classes.Cliente;
import estudosjava.Jenums.classes.TipoCliente;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.AVISTA);
		System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
		System.out.println(TipoCliente.PESSOA_FISICA.getId());
		System.out.println(cliente);
	}

}
