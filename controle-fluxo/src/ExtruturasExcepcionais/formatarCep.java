package ExtruturasExcepcionais;

public class formatarCep {
 
    public static void main(String[] args) {
        try {
           String cepFormatado = CepInvalidoException.formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }

         
         
   }
}
