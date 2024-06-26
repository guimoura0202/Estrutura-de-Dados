package Trabalho1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MenuCliente {
    private final Scanner scanner = new Scanner(System.in);


    public void listarMenu(LDECliente listaClientes) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menu de Gerenciamento de Clientes ---");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Editar Cliente");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Excluir Cliente");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarCliente(listaClientes);
                    break;
                case 2:
                    editarCliente(listaClientes);
                    break;
                case 3:
                    listarClientes(listaClientes);
                    break;
                case 4:
                    excluirCliente(listaClientes);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }

    private void adicionarCliente(LDECliente listaClientes) {
        try {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CNH do cliente: ");
            long cnh = scanner.nextLong();
            System.out.print("Digite o telefone do cliente: ");
            long telefone = scanner.nextLong();
            System.out.print("Digite o CPF do cliente: ");
            long cpf = scanner.nextLong();
            scanner.nextLine(); // Consumir a quebra de linha

            NohCliente novoCliente = new NohCliente(nome, cnh, telefone, cpf);
            listaClientes.adicionarOrdenadoCrescente(novoCliente);
            System.out.println("Cliente adicionado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números onde são esperados.");
            scanner.nextLine(); // descarta a entrada incorreta para evitar loops infinitos
        }
    }


    private void editarCliente(LDECliente listaClientes) {
        System.out.print("Digite o CPF do cliente para editar: ");
        long cpf = scanner.nextLong();
        scanner.nextLine(); // Consumir a quebra de linha

        NohCliente cliente = listaClientes.buscarClientePorCpf(cpf);
        if (cliente != null) {
            System.out.print("Digite o novo nome: ");
            cliente.setNome(scanner.nextLine());
            System.out.print("Digite o novo CNH: ");
            cliente.setCnh(scanner.nextLong());
            System.out.print("Digite o novo telefone: ");
            cliente.setTelefone(scanner.nextLong());
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.println("Dados do cliente atualizados com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    private void listarClientes(LDECliente listaClientes) {
        System.out.println("Escolha o modo de listagem:");
        System.out.println("1. Ordem Crescente");
        System.out.println("2. Ordem Decrescente");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                listaClientes.listarInicioFim();
                break;
            case 2:
                listaClientes.listarFimInicio();
                break;
            default:
                System.out.println("Opção inválida. Retornando ao menu principal.");
        }
    }

    private void excluirCliente(LDECliente listaClientes) {
        System.out.print("Digite o CPF do cliente para excluir: ");
        long cpf = scanner.nextLong();
        scanner.nextLine(); // Consumir a quebra de linha
        listaClientes.excluirCliente(cpf);
        System.out.println("Cliente excluído com sucesso!");
    }
}
