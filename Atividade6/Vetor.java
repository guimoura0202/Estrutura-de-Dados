package Atividade6;

import java.util.Random;

public class Vetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        this.elementos = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] = random.nextInt(10000); // Números aleatórios entre 0 e 9999
        }
    }

    public int maiorElementoRecursivo() {
        return maiorElementoRecursivoHelper(0, elementos[0]);
    }

    private int maiorElementoRecursivoHelper(int index, int maxAtual) {
        if (index == elementos.length) {
            return maxAtual;
        }
        if (elementos[index] > maxAtual) {
            maxAtual = elementos[index];
        }
        return maiorElementoRecursivoHelper(index + 1, maxAtual);
    }

    public int maiorElementoIterativo() {
        int maxElemento = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            if (elementos[i] > maxElemento) {
                maxElemento = elementos[i];
            }
        }
        return maxElemento;
    }
}