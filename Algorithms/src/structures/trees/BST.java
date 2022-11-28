package data_structure.trees;

public class BST {

    Node root;


    public Node addNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addNode(current.left, value);
        } else if (value > current.value) {
            current.right = addNode(current.right, value);
        }
        return current;
    }

    public void add(int value) {
        this.root = addNode(this.root, value);
    }

    public BST createTree() {
        BST bst = new BST();
        bst.add(8);
        bst.add(1);
        bst.add(5);
        bst.add(90);
        bst.add(0);
        return bst;
    }

    public void traverseTreeInOrder(Node node) {
        if (node != null) {
            traverseTreeInOrder(node.left);
            System.out.println(node.value);
            traverseTreeInOrder(node.right);
        }
    }

    public static void main(String [] args) {
        BST bst = new BST();
        BST tree = bst.createTree();

        tree.traverseTreeInOrder(tree.root);
    }

    class Node {

        Node left, right;
        int value;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

}

