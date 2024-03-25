package Atividade1;
import java.util.Scanner;
//Esse código é a resolução da atividade 1 da disciplina de Estrutura de Dados, da aula do dia 22/03/2024
//O autor desse código é o aluno Guilherme Moura, de matrícula 2210100409
public class Main{
    public static void main(String[]args){
        try (Scanner e = new Scanner(System.in)) {
            System.out.println("Informe o local no plano cartesiano onde o ponto A está localizado:");
            System.out.println("Em x:");
            float xA = e.nextFloat();
            System.out.println("Em y:");
            float yA = e.nextFloat();
            System.out.println("Informe o local no plano cartesiano onde o ponto B está localizado:");
            System.out.println("Em x:");
            float xB = e.nextFloat();
            System.out.println("Em y:");
            float yB = e.nextFloat();
            //criação de pontos cartesianos usando o construtor da classe PontoCartesiano
            PontoCartesiano pontoCartesiano1 = new PontoCartesiano(xA, yA);
            PontoCartesiano pontoCartesiano2 = new PontoCartesiano(xB, yB);
            //Testando se o método da distância funciona
            System.out.println("A distância entre os pontos cartesianos é de "+pontoCartesiano1.retornaDistancia(pontoCartesiano2));
        }
    }
}
