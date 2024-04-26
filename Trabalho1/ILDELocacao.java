package Trabalho1;

public interface ILDELocacao {
    void adicionarNoLocacao(NohLocacao novoNoh);
    void adicionarLocacaoInicio(NohLocacao novoNoh);
    void adicionarLocacaoFim(NohLocacao novoNoh);
    void alocarVeiculoCliente(NohCliente cliente, NohVeiculo veiculo, LDEVeiculo ldeVeiculo);
    void excluirLocacao(NohVeiculo placaVeiculo);
    void visualizarLocacoes();
    void listarInicioFimLocacao(NohLocacao novoNoh);
    void listarFimInicioLocacao(NohLocacao novoNoh);

}
