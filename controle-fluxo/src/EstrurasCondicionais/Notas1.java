package EstrurasCondicionais;
public class Notas1 {
    public static void main(String[] args) {
        int nota = 5;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
// esta varialvel aponta que se minha nota for >=7 sou aprovada que é o ? se não que é os : sou reprovada
//condição ternária ela possibilita deixar o código mais clean visualmente
//condições true - aprovado e false - reprovado
        System.out.println(resultado);
    }
}
