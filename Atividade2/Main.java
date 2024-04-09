package Atividade2;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        vetor.adicionaAluno("João", 20, 8.5);
        vetor.adicionaAluno("Maria", 21, 9.0);
        vetor.adicionaAluno("José", 22, 7.5);
        vetor.adicionaAluno("Ana", 23, 6.0);
        System.out.println(vetor.numeroDeAlunos());
        System.out.println(vetor.contem("João", 20, 8.5));
        System.out.println(vetor.contem("Maria", 21, 9.0));
        System.out.println(vetor.contem("Guilherme", 21, 10.0));      
    }
}
