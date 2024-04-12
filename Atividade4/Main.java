package Atividade4;

public class Main {
    public static void main(String[] args) {
        LSE lista = new LSE();
        Aluno a1 = new Aluno("João", 20, 8.5);
        Aluno a2 = new Aluno("Maria", 21, 9.0);
        Aluno a3 = new Aluno("José", 22, 7.5);
        lista.insereInicio(a1);
        lista.insereFim(a2);
        lista.insereFim(a3);
        lista.imprimir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        lista.remover(a2);
        lista.imprimir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
    }
}
