package Trabalho1;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private LDECliente listaClientes = new LDECliente(null, null);
    private LDECategoria listaCategorias = new LDECategoria();
    private LDEVeiculo listaVeiculos = new LDEVeiculo();
    private LDELocacao listaLocacoes = new LDELocacao(null, null);
    MenuCategoria menuCategoria = new MenuCategoria();
    MenuCliente menuCliente = new MenuCliente();
    MenuVeiculo menuVeiculo = new MenuVeiculo();
    MenuLocacao menuLocacao = new MenuLocacao();
    public void exibirMenu() {

        boolean executando = true;
        while (executando) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Veículos");
            System.out.println("3. Gerenciar Categorias");
            System.out.println("4. Gerenciar Locações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    menuCategoria.listarMenu(listaCategorias);
                    break;
                case 2:
                    menuVeiculo.listarMenu(listaVeiculos);
                    break;
                case 3:
                    menuCategoria.listarMenu(listaCategorias);
                    break;
                case 4:
                    menuLocacao.listarMenu(listaLocacoes, listaClientes, listaVeiculos);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
