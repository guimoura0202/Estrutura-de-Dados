package Atividade11;

public class Main {
    public static void main(String[] args) {
        FilaLSE fila = new FilaLSE();

        Aluno aluno1 = new Aluno("João", 20, 7.5);
        Aluno aluno2 = new Aluno("Maria", 22, 8.7);
        Aluno aluno3 = new Aluno("Pedro", 21, 6.9);

        fila.add(aluno1);
        fila.add(aluno2);
        fila.add(aluno3);

        System.out.println("Fila original:");
        fila.printTodo();

        PilhaLista pilha = new PilhaLista();

        // Transferir elementos da fila para a pilha
        while (!fila.isEmpty()) {
            pilha.push(fila.peek());
            fila.remove();
        }

        // Transferir elementos da pilha de volta para a fila (invertendo a ordem)
        while (!pilha.isEmpty()) {
            fila.add(pilha.top());
            pilha.pop();
        }

        System.out.println("Fila invertida:");
        fila.printTodo();
    }
}
