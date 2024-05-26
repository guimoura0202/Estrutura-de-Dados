package Atividade7;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);
        int ultimoElemento = vetor.elementos[vetor.elementos.length - 1];

        // Medir tempo de execução do método iterativo
        long inicioIterativo = System.nanoTime();
        int resultadoIterativo = vetor.pesquisaBinariaIterativa(ultimoElemento);
        long fimIterativo = System.nanoTime();
        long tempoIterativo = fimIterativo - inicioIterativo;

        // Medir tempo de execução do método recursivo
        long inicioRecursivo = System.nanoTime();
        int resultadoRecursivo = vetor.pesquisaBinariaRecursiva(ultimoElemento);
        long fimRecursivo = System.nanoTime();
        long tempoRecursivo = fimRecursivo - inicioRecursivo;

        // Imprimir resultados
        System.out.println("Resultado da Pesquisa Binária Iterativa: " + resultadoIterativo);
        System.out.println("Tempo de Execução (Iterativo): " + tempoIterativo + " nanosegundos");

        System.out.println("Resultado da Pesquisa Binária Recursiva: " + resultadoRecursivo);
        System.out.println("Tempo de Execução (Recursivo): " + tempoRecursivo + " nanosegundos");
    }
}
