package Trabalho1;

public class NohCategoria {
    private int codCategoria;
    private String categoria;
    private NohCategoria proximo;  // Conforme usado em LDECategoria
    private NohCategoria anterior;  // Conforme usado em LDECategoria

    public NohCategoria(int codCategoria, String categoria) {
        this.codCategoria = codCategoria;
        this.categoria = categoria;
        this.proximo = null;
        this.anterior = null;
    }

    // Getters e setters para o código da categoria e nome
    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Getters e setters para os nós próximo e anterior
    public NohCategoria getProx() {
        return proximo;
    }

    public void setProx(NohCategoria proximo) {
        this.proximo = proximo;
    }

    public NohCategoria getAnt() {
        return anterior;
    }

    public void setAnt(NohCategoria anterior) {
        this.anterior = anterior;
    }
    public String getNomeCategoria() {
        return categoria;
    }
}
