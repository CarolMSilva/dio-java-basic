import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args){
//criando o objeto scanner
                try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                    {
                        System.out.println("Por favor digite seu nome");
                        String nome = scanner.next();
                        
                        System.out.println("Por favor digite seu sobrenome");
                        String sobrenome = scanner.next();
     
                        System.out.println("Agora digite sua agência");
                        String agencia = scanner.next();
     
                        System.out.println("Por favor digite sua conta");
                        int conta = scanner.nextInt();
                        
                        System.out.println("Para finalizarmos, por favor digite seu saldo e aguarde.");
                        double saldo = scanner.nextDouble();
     
                        
                        //imprimindo os dados obtidos pelo usuario
                        System.out.println("Ola,"+nome+"  "+sobrenome+","+" obrigado por criar uma conta em nosso banco");
                        System.out.println("sua agência é "+agencia+","+" conta "+conta);
                        System.out.println("e seu saldo "+saldo+" já está disponível para saque ");
                    }
                }
        }
          
    }
