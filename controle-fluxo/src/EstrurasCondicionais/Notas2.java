package EstrurasCondicionais;
public class Notas2 {
    public static void main(String[] args) {
        int nota = 5;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Prova Final" : "Reprovado";
// esta varialvel aponta que se minha nota for >=7 sou aprovada que é o ? se não que é os : sou reprovada >=5 && = e <7 prova final
//condição ternária ela possibilita deixar o código mais clean visualmente		
// estas condições podem ser data, objeto, não se reume a strings.        
        System.out.println(resultado);
    }
}
