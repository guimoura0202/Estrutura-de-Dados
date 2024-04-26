package Trabalho1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCategoria {
    MenuCategoria() {
    }
    Scanner scanner = new Scanner(System.in);

    public void listarMenu(LDECategoria listaCategorias) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menu de Gerenciamento de Categorias ---");
            System.out.println("1. Carregar Categorias de CSV");
            System.out.println("2. Listar Categorias do Início ao Fim");
            System.out.println("3. Listar Categorias do Fim ao Início");
            System.out.println("4. Adicionar Categoria");
            System.out.println("5. Editar Categoria");
            System.out.println("6. Excluir Categoria");
            System.out.println("7. Voltar");
            System.out.print("Escolha uma opção: ");
            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcao) {
                    case 1:
                        listaCategorias.lerCsv();
                        break;
                    case 2:
                        listaCategorias.listarInicioFimCategoria();
                        break;
                    case 3:
                        listaCategorias.listarFimInicioCategoria();
                        break;
                    case 4:
                        adicionarCategoria(listaCategorias);
                        break;
                    case 5:
                        editarCategoria(listaCategorias);
                        break;
                    case 6:
                        excluirCategoria(listaCategorias);
                        break;
                    case 7:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // descartar entrada incorreta
            }
        }
    }
    private void adicionarCategoria(LDECategoria listaCategorias) {
        System.out.print("Digite o código da nova categoria: ");
        int cod = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nom\n" + //
                        "    public void listarMenu(LDECategoria listaCategorias) {\n" + //
                        "        boolean continuar = true;\n" + //
                        "        while (continuar) {\n" + //
                        "            System.out.println(\"\\n" + //
                        "--- Menu de Gerenciamento de Categorias ---\");\n" + //
                        "            System.out.println(\"1. Carregar Categorias de CSV\");\n" + //
                        "            System.out.println(\"2. Listar Categorias do Início ao Fim\");\n" + //
                        "            System.out.println(\"3. Listar Categorias do Fim ao Início\");\n" + //
                        "            System.out.println(\"4. Adicionar Categoria\");\n" + //
                        "            System.out.println(\"5. Editar Categoria\");\n" + //
                        "            System.out.println(\"6. Excluir Categoria\");\n" + //
                        "            System.out.println(\"7. Voltar\");\n" + //
                        "            System.out.print(\"Escolha uma opção: \");\n" + //
                        "            try {\n" + //
                        "                int opcao = scanner.nextInt();\n" + //
                        "                scanner.nextLine(); // Consumir a quebra de linha\n" + //
                        "\n" + //
                        "                switch (opcao) {\n" + //
                        "                    case 1:\n" + //
                        "                        listaCategorias.lerCsv();\n" + //
                        "                        break;\n" + //
                        "                    case 2:\n" + //
                        "                        listaCategorias.listarInicioFimCategoria();\n" + //
                        "                        break;\n" + //
                        "                    case 3:\n" + //
                        "                        listaCategorias.listarFimInicioCategoria();\n" + //
                        "                        break;\n" + //
                        "                    case 4:\n" + //
                        "                        adicionarCategoria(listaCategorias);\n" + //
                        "                        break;\n" + //
                        "                    case 5:\n" + //
                        "                        editarCategoria(listaCategorias);\n" + //
                        "                        break;\n" + //
                        "                    case 6:\n" + //
                        "                        excluirCategoria(listaCategorias);\n" + //
                        "                        break;\n" + //
                        "                    case 7:\n" + //
                        "                        continuar = false;\n" + //
                        "                        break;\n" + //
                        "                    default:\n" + //
                        "                        System.out.println(\"Opção inválida. Por favor, tente novamente.\");\n" + //
                        "                }\n" + //
                        "            } catch (InputMismatchException e) {\n" + //
                        "                System.out.println(\"Entrada inválida. Por favor, insira um número.\");\n" + //
                        "                scanner.nextLine(); // descartar entrada incorreta\n" + //
                        "            }\n" + //
                        "        }\n" + //
                        "    }e da nova categoria: ");
        String nome = scanner.nextLine();
        NohCategoria novoNoh = new NohCategoria(cod, nome);
        listaCategorias.adicionarNohCategoria(novoNoh);
        System.out.println("Categoria adicionada com sucesso!");
    }

    private void editarCategoria(LDECategoria listaCategorias) {
        System.out.print("Digite o código da categoria a ser editada: ");
        int codCategoria = scanner.nextInt();
        scanner.nextLine();
        NohCategoria categoria = listaCategorias.buscaCategoria(codCategoria);
        if (categoria != null) {
            System.out.print("Digite o novo nome da categoria: ");
            categoria.setCategoria(scanner.nextLine());
            System.out.println("Categoria editada com sucesso!");
        } else {
            System.out.println("Categoria não encontrada!");
        }
    }

    private void excluirCategoria(LDECategoria listaCategorias) {
        System.out.print("Digite o código da categoria a ser excluída: ");
        int codCategoria = scanner.nextInt();
        scanner.nextLine();
        listaCategorias.excluirCategoria(codCategoria);
        System.out.println("Categoria excluída com sucesso!");
    }
}
