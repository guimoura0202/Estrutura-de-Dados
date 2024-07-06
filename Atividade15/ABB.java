package Atividade15;

public class ABB {
    private Node root;
    private TreeVisualizationPanel treePanel;

    public void setTreePanel(TreeVisualizationPanel treePanel) {
        this.treePanel = treePanel;
    }

    // Função para obter a altura de um nó
    private int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Função para obter o maior valor entre dois inteiros
    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Função utilitária para realizar uma rotação à direita
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Realizando a rotação
        x.right = y;
        y.left = T2;

        // Atualizando alturas
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        if (treePanel != null) {
            treePanel.log("RSD (Right Single Rotation) aplicada.");
            treePanel.repaint();
        }

        // Retornando nova raiz
        return x;
    }

    // Função utilitária para realizar uma rotação à esquerda
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Realizando a rotação
        y.left = x;
        x.right = T2;

        // Atualizando alturas
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        if (treePanel != null) {
            treePanel.log("RSE (Left Single Rotation) aplicada.");
            treePanel.repaint();
        }

        // Retornando nova raiz
        return y;
    }

    // Função para obter o fator de balanceamento de um nó
    private int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node node, int key) {
        // 1. Realizar a inserção normal na BST
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key)
            node.left = insertRec(node.left, key);
        else if (key > node.key)
            node.right = insertRec(node.right, key);
        else // Duplicatas não são permitidas
            return node;

        // 2. Atualizar a altura do nó ancestral
        node.height = 1 + max(height(node.left), height(node.right));

        // 3. Obter o fator de balanceamento deste nó ancestral
        int balance = getBalance(node);

        // Se o nó se tornar desbalanceado, existem 4 casos

        // Caso Esquerda-Esquerda
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Caso Direita-Direita
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Caso Esquerda-Direita
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            if (treePanel != null) {
                treePanel.log("RDD (Left-Right Rotation) aplicada.");
                treePanel.repaint();
            }
            return rightRotate(node);
        }

        // Caso Direita-Esquerda
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            if (treePanel != null) {
                treePanel.log("RDE (Right-Left Rotation) aplicada.");
                treePanel.repaint();
            }
            return leftRotate(node);
        }

        // Retornar o nó (inalterado)
        return node;
    }

    // Função para imprimir a árvore AVL
    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public Node getRoot() {
        return root;
    }
}
