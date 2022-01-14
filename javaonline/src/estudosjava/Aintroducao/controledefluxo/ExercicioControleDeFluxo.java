package estudosjava.Aintroducao.controledefluxo;

public class ExercicioControleDeFluxo {

	public static void main(String[] args) {
		
		/*
		 * Crie uma variavel salario e imprima seu imposto
		 * imposto: 
		 * salario < 1000 5%
		 * salario >= 1000 && salario < 2000 10%
		 * salario >= 2000 && salario < 4000 15%
		 * salario > 5000 20%
		 */
		
		double salario = 900;
		double imposto = 0;
		
		if(salario < 1000) {
			System.out.println("Primeiro if");
			imposto = salario * 5 / 100;
			salario = salario - (salario * 5 / 100);
			
			
		}else if(salario >= 1000 && salario < 2000) {
			System.out.println("Segundo if");
			imposto = salario * 10 / 100;
			salario = salario - (salario * 10 / 100);
			
			
		}else if(salario >= 2000 && salario < 4000) {
			System.out.println("Terceiro if");
			imposto = (salario * 15 / 100);
			salario = salario - (salario * 15 / 100);

		}else {
			System.out.println("Quarto if");
			imposto = (salario * 20 / 100);
			salario = salario - (salario * 20 / 100);
			
		}
		
		System.out.println("Salario com imposto: R$" + salario);
		System.out.println("Valor em reais de imposto: R$" + imposto);
	}

}
