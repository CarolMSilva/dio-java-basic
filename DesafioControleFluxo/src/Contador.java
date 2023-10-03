import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
        try {
		Scanner terminal = new Scanner(System.in);
		
        System.out.println("Seja Bem-Vindo, por favor aguarde as instruções");

        System.out.println("Digite o primeiro parâmetro em número padrão americano");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
//chamando o método contendo a lógica de contagem
           contar(parametroUm, parametroDois);     
            
//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro		
		}catch (final ParametrosInvalidosException exception) {
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro");
            }
			
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        else if(parametroDois == parametroUm){
                    System.out.println("Tente novamente, os parâmetros desta vez estão iguais!");
                } 
        
//realizar o for para imprimir os números com base na variável contagem        
		int contagem = parametroDois - parametroUm;
        for(int x = 1; x < contagem; x++){
            System.out.println("Números incrementados" + x);
        
        }


		
	}
}