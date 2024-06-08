public class Main {
    public static void main(String[] args) {
        int tamanho = 1000;
        Vetor vetor = new Vetor(tamanho);
        for (int i = 0; i < tamanho; i++) {
            vetor.setElemento(i, (int) (Math.random() * 1000));
        }

        int[] elementosOriginal = vetor.getElementos().clone();

        // Bolha
        int[] elementosBolha = elementosOriginal.clone();
        long inicio = System.currentTimeMillis();
        Ordenacao.bolha(elementosBolha);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução (Bolha): " + (fim - inicio) + " ms");

        // Seleção
        int[] elementosSelecao = elementosOriginal.clone();
        inicio = System.currentTimeMillis();
        Ordenacao.selecao(elementosSelecao);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução (Seleção): " + (fim - inicio) + " ms");

        // Inserção
        int[] elementosInsercao = elementosOriginal.clone();
        inicio = System.currentTimeMillis();
        Ordenacao.insercao(elementosInsercao);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução (Inserção): " + (fim - inicio) + " ms");
    }
}
