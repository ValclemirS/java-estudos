public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "p"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
            break;
			}
			case "M": {
				System.out.println("benéficio do plano T + Whats e Intagram grátis");
            break;
			}
			case "B": {
				System.out.println("benéficio do plano M +100 minutos de ligação para qualquer operadora");
            break;                   
			}
            default:{
                System.out.println("selecione uma opção válida");
            }
		}
    }
    
}
