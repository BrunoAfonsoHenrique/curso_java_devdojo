package estudosjava.Jenum.exercicio.teste;

import java.util.Scanner;

import estudosjava.Jenum.exercicio.classes.ClasseTesteEnum;

// import estudosjava.Jenum.exercicio.classes.EnumPlanetas;

public class EnumsPlanetasTeste {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

//		for (EnumPlanetas p : EnumPlanetas.values()) {
//			System.out.printf("%s%n", p);
//		}
		
		String planeta;
		System.out.println("Para qual planeta quer viajar? ");
		planeta = leia.next().toUpperCase();
		leia.close();
		
		ClasseTesteEnum p1 = new ClasseTesteEnum(planeta);
		p1.viajarPlaneta();

	}

}
