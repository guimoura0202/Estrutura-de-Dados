package Atividade5;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 20, 8.5);
        Aluno a2 = new Aluno("Maria", 21, 9.0);
        Aluno a3 = new Aluno("José", 22, 7.5);
        Aluno a4 = new Aluno("Ana", 23, 6.5);
        Aluno a5 = new Aluno("Carlos", 24, 5.5);
        LDE lista = new LDE();
        lista.insereInicio(a1);
        lista.insereInicio(a2);
        lista.insereInicio(a3);
        lista.insereInicio(a4);
        lista.insereInicio(a5);
        lista.imprimir();
        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Removendo Maria");
        lista.remover(a2);
        lista.imprimir();
        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Removendo Ana");
        lista.remover(a4);
        lista.imprimir();
        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Removendo Carlos");
        lista.remover(a5);
        lista.imprimir();
        System.out.println("Tamanho: " + lista.tamanho());
    }
}
