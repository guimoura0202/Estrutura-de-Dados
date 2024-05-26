package Atividade7;

import java.util.Arrays;
import java.util.Random;

public class Vetor {
    public int[] elementos;

    public Vetor(int tamanho) {
        this.elementos = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] = random.nextInt(10000); // Números aleatórios entre 0 e 9999
        }
        Arrays.sort(this.elementos); // Ordenar o vetor para aplicar a pesquisa binária
    }

    public int pesquisaBinariaIterativa(int valor) {
        int esquerda = 0;
        int direita = elementos.length - 1;
        
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (elementos[meio] == valor) {
                return meio;
            }
            if (elementos[meio] < valor) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1; // Não encontrado
    }

    public int pesquisaBinariaRecursiva(int valor) {
        return pesquisaBinariaRecursivaHelper(valor, 0, elementos.length - 1);
    }

    private int pesquisaBinariaRecursivaHelper(int valor, int esquerda, int direita) {
        if (esquerda > direita) {
            return -1; // Não encontrado
        }
        int meio = esquerda + (direita - esquerda) / 2;
        if (elementos[meio] == valor) {
            return meio;
        }
        if (elementos[meio] < valor) {
            return pesquisaBinariaRecursivaHelper(valor, meio + 1, direita);
        } else {
            return pesquisaBinariaRecursivaHelper(valor, esquerda, meio - 1);
        }
    }
}