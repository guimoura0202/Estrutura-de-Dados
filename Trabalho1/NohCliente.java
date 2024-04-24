package Trabalho1; 

public class NohCliente {
    private NohCliente proximo;
    private NohCliente anterior;
    protected String nome;
    protected Long cnh;
    protected Long telefone;
    protected Long cpf;
    private NohCliente info;
    
    public NohCliente(String nome, Long cnh, Long telefone, Long cpf) {
        this.nome = nome;
        this.cnh = cnh;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public void setProx(NohCliente n) { this.proximo = n; }

    public void setAnt(NohCliente n) { this.anterior = n; }
    
    public NohCliente getInfo() {
        return this.info;
    }
    public NohCliente getProx() {
        return this.proximo;
    }
    public NohCliente getAnt() {
        return this.anterior;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnh() {
        return cnh;
    }

    public void setCnh(Long cnh) {
        this.cnh = cnh;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

}
