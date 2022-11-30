package data_structure.trees;

public class BinaryTree {

    Node root;

    private  Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private int traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(node.value);
            traverseInOrder(node.right);
        }
        return 0;
    }

    private BinaryTree createTree() {

        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(9);

        return tree;
    }

    class Node {

        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;

        }

    }



    public static void main(String[] args) {

        BinaryTree t = new BinaryTree();
        BinaryTree binaryTree = t.createTree();

        binaryTree.traverseInOrder(binaryTree.root);
        System.out.println(t.findSum(binaryTree.root));
    }

    int findSum(Node root) {
        if (root == null) return 0;
            return root.value + findSum(root.left) + findSum(root.right);
    }

}
