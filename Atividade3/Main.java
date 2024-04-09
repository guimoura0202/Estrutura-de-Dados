package Atividade3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vetor vet = new Vetor();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Verificar se aluno está na lista");
            System.out.println("4 - Verificar número de alunos");
            System.out.println("5 - Mostrar alunos");
            System.out.println("6 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a idade do aluno: ");
                    int idade = sc.nextInt();
                    System.out.print("Digite a nota do aluno: ");
                    double nota = sc.nextDouble();
                    vet.adicionaAluno(nome, idade, nota);
                    break;
                case 2:
                    System.out.print("Digite o nome do aluno: ");
                    nome = sc.nextLine();
                    System.out.print("Digite a idade do aluno: ");
                    idade = sc.nextInt();
                    System.out.print("Digite a nota do aluno: ");
                    nota = sc.nextDouble();
                    Aluno aluno = new Aluno(nome, idade, nota);
                    if (vet.remove(aluno)) {
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do aluno: ");
                    nome = sc.nextLine();
                    System.out.print("Digite a idade do aluno: ");
                    idade = sc.nextInt();
                    System.out.print("Digite a nota do aluno: ");
                    nota = sc.nextDouble();
                    if (vet.contem(nome, idade, nota)) {
                        System.out.println("Aluno encontrado!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Número de alunos: " + vet.numeroDeAlunos());
                    break;
                case 5:
                    System.out.println(vet.toString());
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        sc.close();
    }
}
