package estudosjava.Kclassesabstratas.teste;

import estudosjava.Kclassesabstratas.classes.Funcionario;
import estudosjava.Kclassesabstratas.classes.Gerente;
import estudosjava.Kclassesabstratas.classes.Vendedor;

public class ClassesAbstratasTeste {

	public static void main(String[] args) {
		
		
		Gerente g = new Gerente("Claudia", true, 3200);
		Vendedor v = new Vendedor("Caio", true, 1500, 5000);
		g.calcularSalario();
		v.calcularSalario();
		
		System.out.println(g);
		System.out.println("--------------------------------------------------");
		System.out.println(v);
	}

}
