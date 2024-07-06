package Atividade15;

import java.awt.BorderLayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ABB tree = new ABB();

        // Criar a janela para exibir a árvore e o log
        JFrame frame = new JFrame("Visualização da Árvore AVL");
        JTextArea logArea = new JTextArea(10, 40);
        logArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logArea);
        
        TreeVisualizationPanel treePanel = new TreeVisualizationPanel(tree, logArea);
        tree.setTreePanel(treePanel);

        frame.setLayout(new BorderLayout());
        frame.add(treePanel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);
        
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Inserir os elementos na árvore AVL
        int[] elements = {51, 57, 98, 19, 11, 45, 79};
        for (int element : elements) {
            tree.insert(element);
            try {
                // Pausa para visualização das operações de rebalanceamento
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprimir a árvore em pré-ordem
        System.out.println("A árvore AVL em pré-ordem:");
        tree.preOrder(tree.getRoot());
    }
}
