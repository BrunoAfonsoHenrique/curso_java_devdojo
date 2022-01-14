package estudosjava.Mpolimorfismo.teste;

import estudosjava.Mpolimorfismo.classes.Funcionario;
import estudosjava.Mpolimorfismo.classes.Gerente;
import estudosjava.Mpolimorfismo.classes.RelatorioPagamento;
import estudosjava.Mpolimorfismo.classes.Vendedor;

public class PolimorfismoTeste {

	public static void main(String[] args) {
		
		Gerente g = new Gerente("Newt Scamander", 5000, 2000);
		Vendedor v = new Vendedor("Albus Dumbledore", 2000, 20000);
		
		RelatorioPagamento relatorio = new RelatorioPagamento();
		
//		relatorio.relatorioPagamentoGerente(g);
//		relatorio.relatorioPagamentoVendedor(v);
		
		relatorio.relatorioPagamentoGenerico(g);
		System.out.println("-------------------------------------");
		relatorio.relatorioPagamentoGenerico(v);
		
//		Funcionario f  = g;
//		System.out.println("-------------------------------------");
//		System.out.println(f.getSalario());
		
		

	}

}
