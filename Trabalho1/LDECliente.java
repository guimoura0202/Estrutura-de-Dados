package Trabalho1;

public class LDECliente implements ILDECliente {
    private NohCliente primeiro;
    public NohCliente getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NohCliente primeiro) {
        this.primeiro = primeiro;
    }

    private NohCliente ultimo;

    public LDECliente(NohCliente primeiro, NohCliente ultimo) {
        this.primeiro = null;
        this.ultimo = null;
    }

    @Override
    public void adicionarNoCliente(NohCliente novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void adicionarNoClienteF(NohCliente novoNoh) {
        if (this.ultimo == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setAnt(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void exibirClientes() {
        NohCliente atual = this.primeiro;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", CNH: " + atual.cnh + ", Telefone: " + atual.telefone
                    + ", CPF: " + atual.cpf);
            atual = atual.getProx();
        }
    }

    @Override
    public void listarCliente() {
        NohCliente atual = this.ultimo;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", CNH: " + atual.cnh + ", Telefone: " + atual.telefone
                    + ", CPF: " + atual.cpf);
            atual = atual.getAnt();
        }

    }

    @Override
    public void editarCliente(Long cpf) {
        NohCliente atual = this.primeiro;
        while (atual != null) {
            if (atual.getCpf()==(cpf)) {
                atual.setNome(null);
                atual.setCnh(Long.valueOf(0));
                atual.setTelefone(Long.valueOf(0));
                break;
            }
            atual = atual.getProx();
        }

    }

    @Override
    public void excluirCliente(Long cpf) {
        NohCliente atual = this.primeiro;
        while (atual != null) {
            if (atual.getCpf()==(cpf)) {
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
    }
    // método buscarCliente
    public NohCliente buscarClientePorCpf(Long cpf) {
        NohCliente atual = primeiro;
    
        while (atual != null) {
            if (atual.getCpf().equals(cpf)) {
                return atual;
            }
            atual = atual.getProx();
        }
    
        return null;
    }
}

