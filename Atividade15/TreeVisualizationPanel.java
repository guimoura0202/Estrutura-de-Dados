package Atividade15;

import javax.swing.*;
import java.awt.*;

public class TreeVisualizationPanel extends JPanel {
    private ABB tree;
    private int nodeSize = 30;
    private int levelSeparation = 50;
    private JTextArea logArea;

    public TreeVisualizationPanel(ABB tree, JTextArea logArea) {
        this.tree = tree;
        this.logArea = logArea;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (tree.getRoot() != null) {
            drawTree(g, tree.getRoot(), getWidth() / 2, 30, getWidth() / 4);
        }
    }

    private void drawTree(Graphics g, Node node, int x, int y, int xOffset) {
        if (node == null) {
            return;
        }

        g.setColor(Color.BLACK);
        g.fillOval(x - nodeSize / 2, y - nodeSize / 2, nodeSize, nodeSize);
        g.setColor(Color.WHITE);
        g.drawString(String.valueOf(node.key), x - 6, y + 4);

        if (node.left != null) {
            g.setColor(Color.BLACK);
            g.drawLine(x - nodeSize / 2, y, x - xOffset + nodeSize / 2, y + levelSeparation);
            drawTree(g, node.left, x - xOffset, y + levelSeparation, xOffset / 2);
        }

        if (node.right != null) {
            g.setColor(Color.BLACK);
            g.drawLine(x + nodeSize / 2, y, x + xOffset - nodeSize / 2, y + levelSeparation);
            drawTree(g, node.right, x + xOffset, y + levelSeparation, xOffset / 2);
        }
    }

    public void log(String message) {
        logArea.append(message + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }
}
