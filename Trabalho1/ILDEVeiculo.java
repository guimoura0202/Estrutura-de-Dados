package Trabalho1;

public interface ILDEVeiculo {

    void adicionarNohVeiculo(NohVeiculo novoNoh);

    void adicionarNohVeiculF(NohVeiculo novoNoh);

    void imprimirNohVeiculo();

    void adicionarVeiculoInicio(NohVeiculo novoNoh);

    void adicionarVeiculoFim(NohVeiculo novoNoh);

    void lerCsv();

    /*void listarVeiculo();*/

    void listarInicioFimVeiculo();

    void listarFimInicioVeiculo();

    void editarVeiculo(String placa);

    void excluirVeiculo(String placa);

}