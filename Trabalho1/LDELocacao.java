package Trabalho1;

public class LDELocacao implements ILDELocacao {
    private NohLocacao primeiro;
    private NohLocacao ultimo;

    public LDELocacao(NohLocacao primeiro, NohLocacao ultimo) {
        this.primeiro = primeiro;
        this.ultimo = ultimo;
    }

    private LDELocacao(NohCliente cliente, NohVeiculo veiculo) {
        
    }

    @Override
    public void adicionarNoLocacao(NohLocacao novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }

    }

    @Override
    public void adicionarLocacaoInicio(NohLocacao novoNoh) {

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
    public void adicionarLocacaoFim(NohLocacao novoNoh) {

        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.ultimo;
            this.ultimo = novoNoh;
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void alocarVeiculoCliente(NohCliente cliente, NohVeiculo veiculo) {
        LDELocacao locacao = new LDELocacao(cliente, veiculo);
        NohLocacao novoNoh = new NohLocacao(locacao);
        adicionarNoLocacao(novoNoh);
        System.out.println("Veículo alocado com sucesso para o cliente " + cliente.getNome() + "!");
    }

    @Override
    public void excluirLocacao(NohVeiculo placaVeiculo) {/* throws NullPointerException, IllegalArgumentException { */
        NohLocacao atual = this.primeiro;
        while (atual != null) {
            if (atual.getPlacaVeiculo() == (placaVeiculo)) {
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
            System.out.println("Locação excluida com sucesso!");
        }
    }

    @Override
    public void visualizarLocacoes() {
        NohLocacao atual = this.primeiro;
        if (atual == null) {
            System.out.println("Não há locações cadastradas.");
        } else {
            while (atual != null) {
                System.out.println("-----");
                System.out.println(
                        "Veículo: " + atual.getPlacaVeiculo());
                System.out
                        .println("Cliente: " + atual.getCnh().getNome());
                System.out.println("Data de início: " + atual.getDataRetirada());
                System.out.println("Data de fim: " + atual.getDataDevolucao());
                System.out.println("Valor total: " + atual.getValor());
                atual = atual.getProx();
            }
        }
    }

    @Override
    public void listarInicioFimLocacao(NohLocacao novoNoh) {
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
    public void listarFimInicioLocacao(NohLocacao novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.ultimo;
            this.ultimo = novoNoh;
            this.ultimo = novoNoh;
        }
    }
}
