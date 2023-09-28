package EstrurasCondicionais;
public class SistemaMedida{
       public static void main(String[] args) {
// Modo condicional switch / case 
//se esquecer de colocar o break ele imprime vários além dos que eu desejo
//avalie bem o cenário e o time para ver se é o melhor recurso da linguagem.    
        String sigla = "MM";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MEDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
        }
    }
}
      
    
