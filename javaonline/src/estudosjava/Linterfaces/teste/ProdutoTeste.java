package estudosjava.Linterfaces.teste;

import estudosjava.Linterfaces.classes.Produto;
//import estudosjava.Linterfaces.interfaces.Tributavel;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p = new Produto("Notebook", 4.0, 3000);
		p.calcularImposto();
		p.calcularFrete();
		System.out.println(p);
		
		//Tributavel t; --> pode fazer
		//Tributavel t = new Tributavel(); --> Não pode
	}

}
