package Trabalho1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LDEVeiculo implements ILDEVeiculo {
    private NohVeiculo primeiro;
    private NohVeiculo ultimo;

    public LDEVeiculo() {
        this.primeiro = null;
        this.ultimo = null;
    }

    @Override
    public void adicionarNohVeiculo(NohVeiculo novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void adicionarVeiculoInicio(NohVeiculo novoNoh) {

        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.primeiro;
            this.primeiro = novoNoh;
            this.primeiro = novoNoh;
        }
    }

    @Override
    public void adicionarVeiculoFim(NohVeiculo novoNoh) {

        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.ultimo;
            this.ultimo = novoNoh;
            this.ultimo = novoNoh;
        }
    }

    public NohVeiculo buscarVeiculoPorPlaca(String placa) {
        NohVeiculo atual = primeiro;
    
        while (atual != null) {
            if (atual.getPlaca().equals(placa)) {
                return atual;
            }
            atual = atual.getProx();
        }
    
        return null;
    }
    

    @Override
    public void imprimirNohVeiculo() {
        NohVeiculo atual = this.primeiro;
        while (atual != null) {
            System.out.println("placa: " + atual.placa);
            System.out.println("Modelo: " + atual.modelo);
            System.out.println("marca: " + atual.marca);
            System.out.println("ano: " + atual.ano);
            System.out.println("potencia: " + atual.potencia);
            System.out.println("Categoria" + atual.categoria + "\n");
            atual = atual.getProx();

        }
    }

    @Override
    public void lerCsv() {

        String caminho = "/home/guilhermedevilademoura/Área de Trabalho/Estrutura-de-Dados/Trabalho1/Veiculos.csv";
        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String linha = lerArquivo.readLine();
            linha = lerArquivo.readLine();
            ILDEVeiculo lista = new LDEVeiculo();
            while (linha != null) {
                String[] atributos = linha.split(";");
                String placa = atributos[0];
                String modelo = atributos[1];
                String marca = atributos[2];
                int ano = Integer.parseInt(atributos[3]);
                double potencia = Double.parseDouble(atributos[4]);
                int nLugares = Integer.parseInt(atributos[5]);
                int categoria = Integer.parseInt(atributos[6]);
                NohVeiculo novoNoh = new NohVeiculo(placa, modelo, marca, ano, potencia, nLugares, categoria);
                lista.adicionarNohVeiculo(novoNoh);
                linha = lerArquivo.readLine();
            }
            arquivo.close();
            lista.imprimirNohVeiculo();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    
    @Override
    public void editarVeiculo(String placa) {
        lerCsv();
        NohVeiculo atual = this.primeiro;
        while (atual != null) {
            if (atual.getPlaca() == (placa)) {
                atual.setModelo(null);
                atual.setMarca(null);
                atual.setAno(0);
                atual.setPotencia(0);
                atual.setnLugares(0);
                break;
            }
            atual = atual.getProx();
        }

    }

    public void excluirVeiculo(String placa) {
        try{
            NohVeiculo atual = this.primeiro;
            while (atual != null) {
                if (atual.getPlaca().equals(placa)) {
                    if (atual == primeiro) {
                        primeiro = atual.getProx();
                        if (primeiro != null) {
                            primeiro.setAnt(null);
                        } else {
                            ultimo = null;
                        }
                    } else if (atual == ultimo) {
                        ultimo = atual.getAnt();
                        ultimo.setProx(null);
                    } else {
                        atual.getAnt().setProx(atual.getProx());
                        atual.getProx().setAnt(atual.getAnt());
                    }
                    break;
                }
                atual = atual.getProx();
            }
            if (atual == null) {
                throw new Exception("Veículo não encontrado!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void listarInicioFimVeiculo() {
        lerCsv();
        NohVeiculo atual = this.primeiro;
        while (atual != null) {
            System.out.println("Placa: " + atual.placa + ", Modelo: " + atual.modelo + ", Marca: " + atual.marca
                    + ", Ano: " + atual.ano + ", Número de Lugares: " + atual.nLugares + " e Potencia: "
                    + atual.potencia);
            atual = atual.getProx();
        }
    }

    @Override
    public void listarFimInicioVeiculo() {
        NohVeiculo atual = this.ultimo;
        while (atual != null) {
            System.out.println("Placa: " + atual.placa + ", Modelo: " + atual.modelo + ", Marca: " + atual.marca
                    + ", Ano: " + atual.ano + ", Número de Lugares: " + atual.nLugares + "e Potencia: "
                    + atual.potencia);
            atual = atual.getAnt();
        }

    }

    @Override
    public void adicionarNohVeiculF(NohVeiculo novoNoh) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNohVeiculF'");
    }

}