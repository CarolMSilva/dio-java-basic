package EstrurasCondicionais;
public class PlanoOperadora {
    public static void main(String[] args) {
//este cenário é ótimo para usar o switch pois não preciso duplicar informação       
        String plano = "M"; // M / T
        
        switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
        }
    }
}
