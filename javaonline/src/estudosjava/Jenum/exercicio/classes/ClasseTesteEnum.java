package estudosjava.Jenum.exercicio.classes;

public class ClasseTesteEnum {
	
	EnumPlanetas planeta;
	
	public ClasseTesteEnum(String planeta){
		this.planeta = EnumPlanetas.valueOf(planeta);
	}
	
	public void viajarPlaneta() {
		switch(this.planeta) {
		case MERCURIO:
			System.out.println("Muito quente por l�");
			break;
		case TERRA:
			System.out.println("J� estamos aqui");
			break; 
		case URANO:
			System.out.println("Muito longe");
			break;
		default:
			System.out.println("Passagens esgotadas");
		}
	}
}
