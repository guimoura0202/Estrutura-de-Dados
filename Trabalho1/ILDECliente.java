package Trabalho1;

public interface ILDECliente {

    void adicionarNoCliente(NohCliente novoNoh);

    void adicionarNoClienteF(NohCliente novoNoh);

    void exibirClientes();

    void listarCliente();

    void editarCliente(Long cpf);

    void excluirCliente(Long cpf);

}