package estudosjava.Aintroducao.controledefluxo;

public class ControleDeFluxoDois {

	public static void main(String[] args) {
		
		// forma de inicilaizar uma vari�vel utilizando uma linha apenas
		int idade = 15;
		String status = "";
		status = idade < 18 ? "N�o adulto" : "Adulto"; //(Verdadeiro - falso)
		System.out.println("Status = " + status);
		
		System.out.println("--------------------------------------------------");
		
		status = idade < 15 ? "N�o adulto" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto"; //(Verdadeiro - falso)
		System.out.println("Status = " + status);

		// � aconselhavel usar para um if-else apenas
		// pode colocar o operdor ternario dentro de um println
	}

}
