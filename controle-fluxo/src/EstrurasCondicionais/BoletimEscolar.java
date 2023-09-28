package EstrurasCondicionais;
public class BoletimEscolar {
    public static void main(String[] args) {
        int nota = 4;

	if (nota >= 7)
//primeira instrução - expreção deve retornar true
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
//segunda instrução - expreção deve retornar true ou false
		System.out.println("Prova Final");
	else
//terceira instrução
		System.out.println("Reprovado");
    }
}
