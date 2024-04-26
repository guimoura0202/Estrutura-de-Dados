package Trabalho1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LDECategoria implements ILDECategoria {
    private NohCategoria primeiro;
    private NohCategoria ultimo;

    public LDECategoria() {
        this.primeiro = null;
        this.ultimo = null;
    }

    @Override
    public void adicionarNohCategoria(NohCategoria novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }
    //Crie metodos que adicionem no inicio e no fim
    public void adicionaCategoriaInicio(NohCategoria novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh.setProx(this.primeiro);
            this.primeiro.setAnt(novoNoh);
            this.primeiro = novoNoh;
        }
    }
    public void adicionaCategoriaFim(NohCategoria novoNoh){
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            novoNoh.setAnt(this.ultimo);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void imprimirNohCategoria() {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            System.out.println("codCategoria: " + atual.getCodCategoria());
            System.out.println("categoria: " + atual.getCategoria() + " \n");
            atual = atual.getProx();
        }
    }

    public void lerCsv() {
        String caminho = "Trabalho1/Categorias.csv";
        try (FileReader arquivo = new FileReader(caminho);
             BufferedReader lerArquivo = new BufferedReader(arquivo)) {
    
            String linha = lerArquivo.readLine(); // Pular cabeçalho se necessário
            while ((linha = lerArquivo.readLine()) != null) {
                String[] atributos = linha.split(";");
                int codCategoria = Integer.parseInt(atributos[0]);
                String categoria = atributos[1];
                NohCategoria novoNoh = new NohCategoria(codCategoria, categoria);
                this.adicionaCategoriaFim(novoNoh); // Adiciona à lista atual
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    

    @Override
    public void listarInicioFimCategoria() {
        NohCategoria atual = primeiro;
        if (atual == null) {
            System.out.println("Nenhuma categoria disponível.");
        } else {
            while (atual != null) {
                System.out.println("Código: " + atual.getCodCategoria() + ", Categoria: " + atual.getNomeCategoria());
                atual = atual.getProx();
            }
        }
    }
    @Override
    public void listarFimInicioCategoria() {
        NohCategoria atual = ultimo;
        if (atual == null) {
            System.out.println("Nenhuma categoria disponível.");
        } else {
            while (atual != null) {
                System.out.println("Código: " + atual.getCodCategoria() + ", Categoria: " + atual.getNomeCategoria());
                atual = atual.getAnt();
            }
        }
    }

    @Override
    public void editarCategoria(int codCategoria) {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            if (atual.getCodCategoria() == (codCategoria)) {
                atual.setCategoria(null);
                break;
            }
            atual = atual.getProx();
        }

    }
    public void excluirCategoria(int codCategoria) {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            if (atual.getCodCategoria() == codCategoria) {
                if (atual == primeiro) {
                    primeiro = atual.getProx();
                    if (primeiro != null) {
                        primeiro.setAnt(null);
                    } else {
                        ultimo = null;  // Se não houver mais nenhum nó, atualiza o último também.
                    }
                } else if (atual == ultimo) {
                    ultimo = atual.getAnt();
                    if (ultimo != null) {
                        ultimo.setProx(null);
                    } else {
                        primeiro = null;  // Se não houver mais nenhum nó, atualiza o primeiro também.
                    }
                } else {
                    atual.getAnt().setProx(atual.getProx());
                    if (atual.getProx() != null) {
                        atual.getProx().setAnt(atual.getAnt());
                    }
                }
                break;
            }
            atual = atual.getProx();
        }
    }
    
    public NohCategoria buscaCategoria(int codCategoria) {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            if (atual.getCodCategoria() == (codCategoria)) {
                return atual;
            }
            atual = atual.getProx();
        }
        return null;
    }
}
