package EstruturasRepetição;

public class ExemploBreakContinue {
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
//break ele não permite imprimir os numeros depois de 3 se for break se for continue ele imprime de acordo com a intrução das variações
            System.out.println(numero);
            
        }   
        }
}
