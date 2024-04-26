package Trabalho1;

import java.util.Scanner;


public class MenuLocacao {
    MenuLocacao(){}
    public void listarMenu(LDELocacao ldeLocacao, LDECliente ldeCliente, LDEVeiculo ldeVeiculo) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Menu Principal de Locações ===");
            System.out.println("1. Adicionar Locação");
            System.out.println("2. Remover Locação");
            System.out.println("3. Listar Locações");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarLocacao(ldeLocacao, ldeCliente, ldeVeiculo);
                    break;
                case 2:
                    removerLocacao(ldeLocacao, ldeVeiculo);
                    break;
                case 3:
                    listarLocacoes(ldeLocacao);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    private void adicionarLocacao(LDELocacao ldeLocacao, LDECliente ldeCliente, LDEVeiculo ldeVeiculo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Adicionar Locação ===");
        System.out.print("Digite o CPF do cliente: ");
        Long cpf = scanner.nextLong();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.nextLine();
        if(ldeCliente.buscarClientePorCpf(cpf) == null){
            System.out.println("Cliente não encontrado");
            return;
        } else if(ldeVeiculo.buscarVeiculoPorPlaca(placa) == null){
            System.out.println("Veículo não encontrado");
            return;
        } else{
            try {
                ldeLocacao.alocarVeiculoCliente(ldeCliente.buscarClientePorCpf(cpf), ldeVeiculo.buscarVeiculoPorPlaca(placa), ldeVeiculo);
                System.out.println("Locação adicionada com sucesso!");
            } catch (Exception e) {
                System.out.println("Não foi possível adicionar a locação: " + e.getMessage());
            }
        }
    }

    private void removerLocacao(LDELocacao ldeLocacao, LDEVeiculo ldeVeiculo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Remover Locação ===");
        System.out.print("Digite a placa do veículo locado: ");
        String placa = scanner.nextLine();

        try {
            ldeLocacao.excluirLocacao(ldeVeiculo.buscarVeiculoPorPlaca(placa));
            System.out.println("Locação removida com sucesso!");
        } catch (Exception e) {
            System.out.println("Não foi possível remover a locação: " + e.getMessage());
        }
    }

    private void listarLocacoes(LDELocacao ldeLocacao) {
        System.out.println("=== Listar Locações ===");
        ldeLocacao.visualizarLocacoes();
    }
}
