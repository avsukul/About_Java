package main.week2.structures.trees;

import java.util.*;

/*
    AVL Self Balancing Tree
* */
public class AVLSelfBalance {

    public static void main(String[] args) {
        Node root = null;

        // **** open scanner ****
        Scanner sc = new Scanner(System.in);

        // **** read node values and build the AVL tree ****
        int N = sc.nextInt();

        for (int n = 0; n <= N; n++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        // **** ****
        inorder(root);
        System.out.println();
        preorder(root);

        // **** close scanner ****
        sc.close();
    }

    /**
     * Function to print preOrder of the tree with balance factor
     * @param node root
     */
    public static void preorder(Node node)
    {
        if(node == null)
            return;
        System.out.print(node.val+"(BF="+balanceFactor(node)+") ");
        preorder(node.left);
        preorder(node.right);
    }

    /**
     * Function to print inOrder of the tree with balance factor
     * @param node root
     */
    public static void inorder(Node node)
    {
        if(node == null)
            return;
        inorder(node.left);
        System.out.print(node.val+"(BF="+balanceFactor(node)+") ");
        inorder(node.right);
    }
    static class Node
    {
        int val;   //Value
        int ht;      //Height
        Node left;   //Left child
        Node right;   //Right child

    }

    /**
     * Function to find height of tree
     * @param root node
     * @return Integer height of tree
     */
    public static int heightMax(Node root)
    {
        int maxHeight = -1;
        if(root.left != null)
            maxHeight = Math.max(maxHeight, root.left.ht);
        if(root.right != null)
            maxHeight = Math.max(maxHeight, root.right.ht);
        return maxHeight;
    }

    /**
     * Function to insert a number in AVL tree height of leaf nodes is considered as 0
     * @param root node of tree
     * @param val to be inserted in the tree
     * @return the new root node of the tree after balancing it
     */
    public static Node insert(Node root, int val)
    {
        if(root == null)
        {
            Node node = new Node();
            node.val = val;
            node.left = node.right = null;
            node.ht = 0;
            return node;
        }
        if(val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        int balanceFactor = balanceFactor(root);
        if(balanceFactor < -1)
        {
            if(balanceFactor(root.right) > 0)
            {
                root.right = rotateRight(root.right);
                return rotateLeft(root);
            }
            else
                return rotateLeft(root);
        }
        else
        {
            if(balanceFactor > 1)
            {
                if(balanceFactor(root.left) < 0)
                {
                    root.left = rotateLeft(root.left);
                    return rotateRight(root);
                }
                else
                    return rotateRight(root);
            }
        }
        root.ht = heightMax(root) + 1;
        return root;
    }

    /**
     * Function to right rotate the tree corresponding to root node
     * @param x node at which right rotation is needed
     * @return the new root of the tree
     */
    public static Node rotateRight(Node x)
    {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        // height
        x.ht = heightMax(x)+1;
        y.ht = heightMax(y)+1;
        return y;
    }
    /**
     * Function to left rotate the tree corresponding to root node
     * @param x node at which left rotation is needed
     * @return the new root of the tree
     */
    public static Node rotateLeft(Node x)
    {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        // height
        x.ht = heightMax(x)+1;
        y.ht = heightMax(y)+1;
        return y;
    }

    /**
     * Function to find balance factor of root
     * @param root node at which balance factor is calcualted
     * @return Integer balance factor of root node
     */
    public static int balanceFactor(Node root)
    {
        int left = -1;
        int right = -1;
        if(root.left != null)
            left = root.left.ht;
        if(root.right != null)
            right = root.right.ht;
        return (left - right);
    }
}