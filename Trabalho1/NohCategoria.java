package Trabalho1;

public class NohCategoria {
    protected int codCategoria;
    protected String categoria;
    private NohCategoria proximo;
    private NohCategoria ant;
    private NohCategoria info;

    public NohCategoria(int codCategoria, String categoria) {
        this.codCategoria = codCategoria;
        this.categoria = categoria;
    }

    public void setProx(NohCategoria n) { this.proximo = n; }

    public void setAnt(NohCategoria n) { this.ant = n; }
    
    public NohCategoria getInfo() {
        return this.info;
    }
    public NohCategoria getProx() {
        return this.proximo;
    }
    public NohCategoria getAnt() {
        return this.ant;
    }

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

    

}
