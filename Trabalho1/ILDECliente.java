package Trabalho1;

public interface ILDECliente {
    // Método para adicionar um cliente de forma ordenada por CPF em ordem crescente
    void adicionarOrdenadoCrescente(NohCliente novoNoh);

    // Listar clientes do início ao fim (ordem crescente por CPF)
    void listarInicioFim();

    // Listar clientes do fim ao início (ordem decrescente por CPF)
    void listarFimInicio();

    // Editar os dados de um cliente específico pelo CPF
    void editarCliente(Long cpf);

    // Excluir um cliente específico pelo CPF
    void excluirCliente(Long cpf);

    // Buscar um cliente específico pelo CPF para operações internas como editar ou excluir
    NohCliente buscarClientePorCpf(Long cpf);
}
