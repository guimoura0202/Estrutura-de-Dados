

public class Main{
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);
    
        // Medir tempo de execução do método recursivo
        long inicioRecursivo = System.nanoTime();
        int maiorRecursivo = vetor.maiorElementoRecursivo();
        long fimRecursivo = System.nanoTime();
        long tempoRecursivo = fimRecursivo - inicioRecursivo;
    
        // Medir tempo de execução do método iterativo
        long inicioIterativo = System.nanoTime();
        int maiorIterativo = vetor.maiorElementoIterativo();
        long fimIterativo = System.nanoTime();
        long tempoIterativo = fimIterativo - inicioIterativo;
    
        // Imprimir resultados
        System.out.println("Maior elemento (Recursivo): " + maiorRecursivo);
        System.out.println("Tempo de execução (Recursivo): " + tempoRecursivo + " nanosegundos");
        System.out.println("Maior elemento (Iterativo): " + maiorIterativo);
        System.out.println("Tempo de execução (Iterativo): " + tempoIterativo + " nanosegundos");
    }
}