package estudosjava.Mpolimorfismo.classes;

public class RelatorioPagamento {
	
//	public void relatorioPagamentoGerente(Gerente gerente) {
//		System.out.println("Gerando relatorio de pagamento para a gerencia");
//		
//		gerente.calcularPagamento();
//		System.out.println("Nome: " + gerente.getNome());
//		System.out.println("Sal�rio do m�s: " + gerente.salario);
//	}
//	
//	
//	public void relatorioPagamentoVendedor(Vendedor vendedor) {
//		System.out.println("Gerando relatorio de pagamento para os vendedores");
//		
//		vendedor.calcularPagamento();
//		System.out.println("Nome: " + vendedor.getNome());
//		System.out.println("Sal�rio do m�s: " + vendedor.salario);
//	}
	
	public void relatorioPagamentoGenerico(Funcionario funcionario) { // parametros polimorficos
		System.out.println("Gerando relatorio de pagamento para Funcionarios");
		
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Sal�rio do m�s: " + funcionario.salario);
		
		if(funcionario instanceof Gerente) {
			Gerente g = (Gerente) funcionario;
			System.out.println("Participa��o nos lucros: " + g.getParticipacaoNoLucro());
		}
		
		if(funcionario instanceof Vendedor) {
			Vendedor v = (Vendedor) funcionario;
			System.out.println("Total de vendas: " + v.getTotalVendas());
		}
		
	}

}
