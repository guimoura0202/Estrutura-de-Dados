package Atividade12;

public class HashTable {
    private Aluno[] table;
    private int size;

    public HashTable(int capacity) {
        this.table = new Aluno[capacity];
        this.size = 0;
    }

    private int hashFunction(String key) {
        return key.hashCode() % table.length;
    }

    public boolean insert(Aluno aluno) {
        if (size >= table.length) {
            System.out.println("Tabela Hash está cheia");
            return false;
        }
        int hash = hashFunction(aluno.getNome());
        int originalHash = hash;
        while (table[hash] != null) {
            hash = (hash + 1) % table.length;
            if (hash == originalHash) {
                // This should not happen if the size check above is correct
                System.out.println("Não foi possível encontrar um slot livre");
                return false;
            }
        }
        table[hash] = aluno;
        size++;
        return true;
    }

    public Aluno search(String nome) {
        int hash = hashFunction(nome);
        int originalHash = hash;
        while (table[hash] != null) {
            if (table[hash].getNome().equals(nome)) {
                return table[hash];
            }
            hash = (hash + 1) % table.length;
            if (hash == originalHash) {
                return null; // Not found
            }
        }
        return null; // Not found
    }

    public boolean delete(String nome) {
        int hash = hashFunction(nome);
        int originalHash = hash;
        while (table[hash] != null) {
            if (table[hash].getNome().equals(nome)) {
                table[hash] = null;
                size--;
                return true;
            }
            hash = (hash + 1) % table.length;
            if (hash == originalHash) {
                return false; // Not found
            }
        }
        return false; // Not found
    }

    public void printTable() {
        System.out.println("Estado atual da tabela hash:");
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                System.out.println("Posição " + i + ": " + table[i]);
            } else {
                System.out.println("Posição " + i + ": Vazio");
            }
        }
    }
}
