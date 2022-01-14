package estudosjava.Aintroducao.controledefluxo;

public class ControleDeFluxoQuatro {

	public static void main(String[] args) {
		
		int contador = 11;
		
		while(contador <= 10) {
			System.out.print(contador + " - ");
			contador++;
		}
		
		System.out.println("\n--------------------------------------------");
		
		do {
			System.out.println("Dentro do Do-While");
		}while(contador < 10);
		
		System.out.println("\n--------------------------------------------");
		
		for(int cont = 1; cont <= 10; cont++) {
			System.out.print(cont + " - ");
			if(cont == 5) {
				break;
			}
		}

	}

}
