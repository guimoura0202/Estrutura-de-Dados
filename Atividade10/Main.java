package Atividade10;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        Aluno aluno1 = new Aluno("João", 20, 7.5);
        Aluno aluno2 = new Aluno("Maria", 22, 8.7);
        Aluno aluno3 = new Aluno("Pedro", 21, 6.9);

        fila.add(aluno1);
        fila.add(aluno2);
        fila.add(aluno3);

        fila.printTudo();

        fila.remove();
        fila.printTudo();

        fila.remove();
        fila.printTudo();
    }
}
