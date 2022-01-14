package estudosjava.Gheranca.teste;

import estudosjava.Gheranca.classes.Endereco;
import estudosjava.Gheranca.classes.Funcionario;
import estudosjava.Gheranca.classes.Pessoa;

public class HerancaTeste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa("Harry");
		Endereco endereco = new Endereco();
		
		//pessoa.setCpf("11122233344");
		
		endereco.setBairro("Bairro 1");
		endereco.setRua("Rua 25");
		//pessoa.setEndereco(endereco);
		
		//pessoa.imprime();
		
		System.out.println("----------------------------------------------------");
		Funcionario funcionario = new Funcionario("Hermione");
		
		funcionario.setCpf("99988877744");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(3200);
		
		//funcionario.imprime();
		
		
		
		

	}

}
