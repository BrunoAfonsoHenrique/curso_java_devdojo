package estudosjava.Aintroducao.controledefluxo;

public class ControleFluxoSeis {
    public static void main(String[] args) {
    	
        //Dado um valor de um carro descruba em quantas vezes ele pode ser parcelado
        // Por�m as parcelas n�o podem ser menores do que 1000
    	
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            
        	double valorParcela = valorTotal / parcela;
            if(valorParcela <= 1000){
               continue;
            }
            
            System.out.printf("Parcela %d R$%.2f" , parcela , valorParcela);
            System.out.println("\ncodigo consumindo mem�ria");
        }
    }
}
