package Atividade13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private ABB tree;
    private TreeVisualizationPanel treePanel;
    private JTextField insertField;
    private JTextField searchField;
    private JLabel searchResultLabel;

    public Main() {
        tree = new ABB();
        treePanel = new TreeVisualizationPanel(tree);

        insertField = new JTextField(5);
        searchField = new JTextField(5);
        searchResultLabel = new JLabel(" ");

        JButton insertButton = new JButton("Inserir");
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int key = Integer.parseInt(insertField.getText());
                tree.insert(key);
                insertField.setText("");
                treePanel.repaint();
            }
        });

        JButton searchButton = new JButton("Buscar");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int key = Integer.parseInt(searchField.getText());
                boolean found = tree.search(key);
                searchResultLabel.setText(found ? "Encontrado" : "Não encontrado");
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Inserir:"));
        controlPanel.add(insertField);
        controlPanel.add(insertButton);
        controlPanel.add(new JLabel("Buscar:"));
        controlPanel.add(searchField);
        controlPanel.add(searchButton);
        controlPanel.add(searchResultLabel);

        setLayout(new BorderLayout());
        add(controlPanel, BorderLayout.NORTH);
        add(treePanel, BorderLayout.CENTER);

        setTitle("Árvore Binária de Busca");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
