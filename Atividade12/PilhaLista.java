package Atividade12;

public class PilhaLista implements IPilha {
    private Noh topo;
    private int tamanho;

    public PilhaLista() {
        this.topo = null;
        this.tamanho = 0;
    }

    @Override
    public boolean push(Object info) {
        Noh novoNoh = new Noh(info);
        novoNoh.setNext(topo);
        topo = novoNoh;
        tamanho++;
        return true;
    }

    @Override
    public boolean pop() {
        if (isEmpty()) {
            System.out.println("Pilha está vazia");
            return false;
        }
        topo = topo.getNext();
        tamanho--;
        return true;
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            return null;
        }
        return topo.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        return tamanho;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Pilha está vazia");
            return;
        }
        Noh atual = topo;
        System.out.println("Estado atual da pilha:");
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }
}
