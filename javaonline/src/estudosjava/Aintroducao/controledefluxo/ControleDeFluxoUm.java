package estudosjava.Aintroducao.controledefluxo;

public class ControleDeFluxoUm {

	public static void main(String[] args) {
		
		//if-else
		
		// idade < 15 categoria infantil
		// idade >= 15 && idade < 18 juvenil
		// idade >= 18 adulto
		
		int idade = 20;
		String categoria = "";
		
		if(idade < 15) {
			categoria = "Infantil";
		}else if(idade >= 15 && idade < 18){
			categoria = "Juvenil";
		}else {
			categoria = "Adulto";
		}
			
		System.out.println(categoria);

	}

}
