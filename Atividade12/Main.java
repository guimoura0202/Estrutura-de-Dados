package Atividade12;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        Aluno aluno1 = new Aluno("João", 20, 7.5);
        Aluno aluno2 = new Aluno("Maria", 22, 8.7);
        Aluno aluno3 = new Aluno("Pedro", 21, 6.9);

        hashTable.insert(aluno1);
        hashTable.insert(aluno2);
        hashTable.insert(aluno3);

        System.out.println("Tabela Hash após inserções:");
        hashTable.printTable();

        System.out.println("Buscar aluno 'Maria': " + hashTable.search("Maria"));

        System.out.println("Deletar aluno 'Pedro'");
        hashTable.delete("Pedro");

        System.out.println("Tabela Hash após deleção:");
        hashTable.printTable();
    }
}
