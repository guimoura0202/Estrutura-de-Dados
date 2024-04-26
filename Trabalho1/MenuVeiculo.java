package Trabalho1;

import java.util.Scanner;

public class MenuVeiculo {
    private final Scanner scanner = new Scanner(System.in);
    MenuVeiculo(){
    }
    public void listarMenu(LDEVeiculo listaVeiculos) {
        int opcao;

        while (true) {
            System.out.println("\n=== Menu Principal de Gerenciamento de Veículos ===");
            System.out.println("1. Adicionar Veículo no Início");
            System.out.println("2. Adicionar Veículo no Fim");
            System.out.println("3. Editar Veículo");
            System.out.println("4. Excluir Veículo");
            System.out.println("5. Listar Veículos (Início ao Fim)");
            System.out.println("6. Listar Veículos (Fim ao Início)");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarVeiculo(true, listaVeiculos);
                    break;
                case 2:
                    adicionarVeiculo(false, listaVeiculos);
                    break;
                case 3:
                    editarVeiculo(listaVeiculos);
                    break;
                case 4:
                    excluirVeiculo(listaVeiculos);
                    break;
                case 5:
                    listaVeiculos.listarInicioFimVeiculo();
                    break;
                case 6:
                    listaVeiculos.listarFimInicioVeiculo();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    return; // Remove scanner.close() para evitar fechar System.in
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void adicionarVeiculo(boolean noInicio, LDEVeiculo listaVeiculos) {
        System.out.println("Informe os dados do veículo:");
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Potência (em CV): ");
        double potencia = scanner.nextDouble();
        System.out.print("Número de Lugares: ");
        int nLugares = scanner.nextInt();
        System.out.print("Categoria (número): ");
        int categoria = scanner.nextInt();  
        NohVeiculo novoVeiculo = new NohVeiculo(placa, modelo, marca, ano, potencia, nLugares, categoria);
        if (noInicio) {
            listaVeiculos.adicionarVeiculoInicio(novoVeiculo);
        } else {
            listaVeiculos.adicionarVeiculoFim(novoVeiculo);
        }

        System.out.println("Veículo adicionado com sucesso!");
    }

    private void editarVeiculo(LDEVeiculo listaVeiculos) {
        System.out.print("Digite a placa do veículo a ser editado: ");
        String placa = scanner.nextLine();
        NohVeiculo veiculo = listaVeiculos.buscarVeiculoPorPlaca(placa);

        if (veiculo != null) {
            System.out.println("Insira os novos dados do veículo (deixe em branco para não alterar):");
            System.out.print("Nova marca: ");
            String marca = scanner.nextLine();
            if (!marca.isEmpty()) veiculo.setMarca(marca);

            System.out.print("Novo modelo: ");
            String modelo = scanner.nextLine();
            if (!modelo.isEmpty()) veiculo.setModelo(modelo);

            System.out.print("Novo ano: ");
            String anoStr = scanner.nextLine();
            if (!anoStr.isEmpty()) veiculo.setAno(Integer.parseInt(anoStr));

            System.out.print("Nova categoria: ");
            String categoria = scanner.nextLine();
            if (!categoria.isEmpty()) veiculo.setCategoria(categoria);

            System.out.print("Novo número de lugares: ");
            String nLugaresStr = scanner.nextLine();
            if (!nLugaresStr.isEmpty()) veiculo.setnLugares(Integer.parseInt(nLugaresStr));

            System.out.print("Nova potência (CV): ");
            String potenciaStr = scanner.nextLine();
            if (!potenciaStr.isEmpty()) veiculo.setPotencia(Float.parseFloat(potenciaStr));

            System.out.print("Nova placa: ");
            String novaPlaca = scanner.nextLine();
            if (!novaPlaca.isEmpty()) veiculo.setPlaca(novaPlaca);

            System.out.println("Veículo editado com sucesso.");
        } else {
            System.out.println("Não foi encontrado veículo com a placa informada.");
        }
    }

    private void excluirVeiculo(LDEVeiculo listaVeiculos) {
        System.out.print("Digite a placa do veículo a ser excluído: ");
        String placa = scanner.nextLine();  // Espera uma string, não um int
        listaVeiculos.excluirVeiculo(placa);
    }
    
}
