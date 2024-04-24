package Trabalho1;

import java.util.Date;

public class NohLocacao {
    private NohLocacao proximo;
    private NohLocacao anterior;
    private double valor;
    private Date dataRetirada;
    private Date dataDevolucao;
    private NohCliente cnh;
    private NohVeiculo placaVeiculo;
    private NohLocacao info;
    
    
    public NohLocacao() {
        this.valor = valor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }


    public NohLocacao(LDELocacao locacao) {
    }

    public NohLocacao getProx(){
        return proximo;
    }


    public void setProx(NohLocacao proximo) {
        this.proximo = proximo;
    }


    public NohLocacao getAnt() {
        return anterior;
    }


    public void setAnt(NohLocacao anterior) {
        this.anterior = anterior;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public Date getDataRetirada() {
        return dataRetirada;
    }


    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }


    public Date getDataDevolucao() {
        return dataDevolucao;
    }


    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    public NohCliente getCnh() {
        return cnh;
    }


    public void setCnh(NohCliente cnh) {
        this.cnh = cnh;
    }


    public NohVeiculo getPlacaVeiculo() {
        return placaVeiculo;
    }


    public void setPlacaVeiculo(NohVeiculo placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }


    public NohLocacao getInfo() {
        return info;
    }


    public void setInfo(NohLocacao info) {
        this.info = info;
    }

}
