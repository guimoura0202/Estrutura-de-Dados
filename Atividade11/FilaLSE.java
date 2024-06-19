package Atividade11;

public class FilaLSE {
    private Noh inicio;
    private Noh fim;
    private int tamanho;

    public FilaLSE() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean add(Object info) {
        Noh novoNoh = new Noh(info);
        if (isEmpty()) {
            inicio = novoNoh;
        } else {
            fim.setNext(novoNoh);
        }
        fim = novoNoh;
        tamanho++;
        return true;
    }

    public boolean remove() {
        if (isEmpty()) {
            System.out.println("Fila está vazia");
            return false;
        }
        inicio = inicio.getNext();
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return true;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return inicio.getInfo();
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return tamanho;
    }

    public void printTodo() {
        if (isEmpty()) {
            System.out.println("Fila está vazia");
            return;
        }
        Noh atual = inicio;
        System.out.println("Estado atual da fila:");
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }
}
