package Atividade9;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5); // Cria uma fila com capacidade de 5 elementos

        // Adicionando elementos à fila
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");
        fila.add("Elemento 4");
        fila.add("Elemento 5");

        // Tentando adicionar um elemento à fila cheia
        boolean added = fila.add("Elemento 6");
        System.out.println("Elemento 6 adicionado: " + added); // Deve imprimir falso

        // Removendo elementos da fila
        fila.remove();
        fila.remove();

        // Adicionando mais elementos à fila
        fila.add("Elemento 6");
        fila.add("Elemento 7");

        // Imprimindo o tamanho da fila
        System.out.println("Tamanho da fila: " + fila.size()); // Deve imprimir 5

        // Removendo todos os elementos da fila
        while (!fila.isEmpty()) {
            fila.remove();
        }

        // Verificando se a fila está vazia
        System.out.println("Fila está vazia: " + fila.isEmpty()); // Deve imprimir verdadeiro
    }
}
