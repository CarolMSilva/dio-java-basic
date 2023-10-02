public class ProcessoSeletivo3 {
	public static void main(String[] args) {
		case3();
		
	}
	static void case3() {
		String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
//forma indexada
//quando preciso do indice para complementar a lógica
		System.out.println("Lista de candidatos selecionados informando o índice");
		for(int x=0; x<candidatosSelecionados.length; x++) {
			System.out.println((x+1)+ "° Candidato é " + candidatosSelecionados [x] );
//x é o indice mas poderia colocar indice=0 indice+1 no código
        }
		
//forma abrevida - for each
//interação total sem precisar da posição ou indice
		System.out.println("O Candidato selecionado foi");
		
		for(String candidato: candidatosSelecionados) {
			System.out.println(candidato);
		}
	}
}

