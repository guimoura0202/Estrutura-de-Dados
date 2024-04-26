package Trabalho1;

public class LDECliente implements ILDECliente {
    private NohCliente primeiro;
    private NohCliente ultimo;

    public LDECliente() {
        this.primeiro = null;
        this.ultimo = null;
    }

    // Adiciona um cliente de forma ordenada (crescente) por CPF
    public void adicionarOrdenadoCrescente(NohCliente novoNoh) {
        if (primeiro == null || novoNoh.getCpf().compareTo(primeiro.getCpf()) < 0) {
            novoNoh.setProx(primeiro);
            if (primeiro != null) {
                primeiro.setAnt(novoNoh);
            }
            primeiro = novoNoh;
            if (ultimo == null) {
                ultimo = novoNoh;
            }
        } else {
            NohCliente atual = primeiro;
            while (atual.getProx() != null && atual.getProx().getCpf().compareTo(novoNoh.getCpf()) < 0) {
                atual = atual.getProx();
            }
            novoNoh.setProx(atual.getProx());
            novoNoh.setAnt(atual);
            if (atual.getProx() != null) {
                atual.getProx().setAnt(novoNoh);
            } else {
                ultimo = novoNoh;
            }
            atual.setProx(novoNoh);
        }
    }

    @Override
    public void listarInicioFim() {
        NohCliente atual = primeiro;  // Começa pelo primeiro nó
        if (atual == null) {
            System.out.println("A lista de clientes está vazia.");
        } else {
            while (atual != null) {
                System.out.println("Cliente: " + atual.getNome() + ", CPF: " + atual.getCpf());
                atual = atual.getProx();  // Move para o próximo nó
            }
        }
    }
    @Override
    public void listarFimInicio() {
        NohCliente atual = ultimo;  // Começa pelo último nó
        if (atual == null) {
            System.out.println("A lista de clientes está vazia.");
        } else {
            while (atual != null) {
                System.out.println("Cliente: " + atual.getNome() + ", CPF: " + atual.getCpf());
                atual = atual.getAnt();  // Move para o nó anterior
            }
        }
    }
    @Override
    public void editarCliente(Long cpf) {
        NohCliente atual = primeiro;
        while (atual != null) {
            if (atual.getCpf().equals(cpf)) {
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
        NohCliente atual = primeiro;
        while (atual != null) {
            if (atual.getCpf().equals(cpf)) {
                if (atual == primeiro) {
                    primeiro = atual.getProx();
                    if (primeiro != null) {
                        primeiro.setAnt(null);
                    } else {
                        ultimo = null;
                    }
                } else if (atual == ultimo) {
                    ultimo = atual.getAnt();
                    if (ultimo != null) {
                        ultimo.setProx(null);
                    } else {
                        primeiro = null;
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
