public class Vetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
    }

    public void setElemento(int indice, int valor) {
        if (indice >= 0 && indice < tamanho) {
            this.elementos[indice] = valor;
        }
    }

    public int getElemento(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return this.elementos[indice];
        }
        return -1; // valor de erro
    }

    public int[] getElementos() {
        return this.elementos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
}