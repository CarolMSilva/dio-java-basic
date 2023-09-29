package EstruturasRepetição;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
//arrays = conjunto de elementos de um tipo correspondente pode ser qualquer coisa - clinte, estoque, etc.
        for (int x = 0; x <alunos.length; x++) {
//o indice começa em 0 e a quantidade de alunos em arrays são 4 então o código só seguiu o nome dos arrays e foi colocando que nº e x pertence a eles            
//sempre inicia em zero o indice de repetição NÃO ESQUEÇER!         
System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        
        }

    
    }
}
