package Atividade10;

public class Fila implements IFila {
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public Fila(int tamFila) {
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    public boolean add(Object object) {
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = object;
        this.nElemFila++;
        return true;
    }

    public boolean remove() {
        if (this.isEmpty()) {
            System.out.println("Fila está vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    public int size() {
        return nElemFila;
    }

    public boolean isEmpty() {
        return nElemFila == 0;
    }

    public void printTudo() {
        if (this.isEmpty()) {
            System.out.println("Fila está vazia");
            return;
        }
        System.out.println("Estado atual da fila:");
        for (int i = 0; i < this.nElemFila; i++) {
            int index = (this.inicio + i) % this.vetFila.length;
            System.out.println(this.vetFila[index]);
        }
    }
}