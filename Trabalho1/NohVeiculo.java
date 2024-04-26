package Trabalho1;

public class NohVeiculo {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected int ano;
    protected double potencia;
    protected int nLugares;
    protected int categoria;
    private NohVeiculo proximo;
    private NohVeiculo ant;
    private NohVeiculo info;
    private boolean disponivel;

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public NohVeiculo(String placa, String modelo, String marca, int ano, double potencia, int nLugares, int categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.nLugares = nLugares;
        this.categoria = categoria;
        this.disponivel = false;
    }

    public void setProx(NohVeiculo n) { this.proximo = n; }

    public void setAnt(NohVeiculo n) { this.ant = n; }
    
    public NohVeiculo getInfo() {
        return this.info;
    }
    public NohVeiculo getProx() {
        return this.proximo;
    }
    public NohVeiculo getAnt() {
        return this.ant;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getnLugares() {
        return nLugares;
    }

    public void setnLugares(int nLugares) {
        this.nLugares = nLugares;
    }

    public String getCategoria() {
        return null;
    }

    public void setCategoria(String text) {
    }
    
}