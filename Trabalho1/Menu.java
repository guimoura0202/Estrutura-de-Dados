package Trabalho1;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private LDECliente listaClientes;
    private LDECategoria listaCategorias;
    private LDEVeiculo listaVeiculos;
    private LDELocacao listaLocacoes;
    private MenuCategoria menuCategoria;
    private MenuCliente menuCliente;
    private MenuVeiculo menuVeiculo;
    private MenuLocacao menuLocacao;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.listaClientes = new LDECliente();
        this.listaCategorias = new LDECategoria();
        this.listaVeiculos = new LDEVeiculo();
        this.listaLocacoes = new LDELocacao(null, null);
        this.menuCategoria = new MenuCategoria();
        this.menuCliente = new MenuCliente();
        this.menuVeiculo = new MenuVeiculo();
        this.menuLocacao = new MenuLocacao();
    }

    public void carregarDadosIniciais() {
        listaCategorias.lerCsv();
        listaVeiculos.lerCsv();
    }

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
                    menuCliente.listarMenu(listaClientes);
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
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.carregarDadosIniciais();
        menu.exibirMenu();
    }
}
