package DSA_CODES.Tree;

import java.util.NoSuchElementException;

/**
 * @Author Bidhu Dash
 * @Date 09-07-2024
 * <p>
 * $$$ Binary Search Tree $$$
 * <p>
 * <p>
 * Root Node: it is the top most node according to hierarchy of the tree.
 * <p>
 * Child Node: it's descendant of any node.
 * <p>
 * Parent Node: it's the node that contains some sub-node.
 * <p>
 * Sibling Node/s: The same node/s which have same parent node.
 * <p>
 * Leaf Node: it's the node which doesn't have any child node.
 * <p>
 * Internal Nodes: nodes that have one or more child nodes.
 * <p>
 * -->it's a non-linear data structure in which one node is connected to n number of nodes.
 * <p>
 * --> It can only have utmost 2 child nodes connected form each parent node. (so contains two pointers)
 * <p>
 * --> A node can be represented as [lift-child], [data] & [right-child]
 * <p>
 * <p>
 * Types of Binary Trees:
 * --> Complete Tree
 * --> Full Tree
 * --> Balanced Tree
 * <p>
 * <p>
 * Search,insert & delete [Time complexity = O(log n)]
 */

public class BST {

    Node root;

    BST() {
        root = null;
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(61);
        tree.insert(52);
        tree.insert(9);
        tree.insert(11);
        tree.insert(78);
        tree.insert(7);
        tree.insert(25);

        System.out.println(tree.root.right.left.key);

        System.out.println("Sorted tree inOrder:");
        tree.inOrder();

        System.out.print("\nIs element present in tree: " + tree.search(7));

        tree.deleteKey(9);
        System.out.print("\nafter deleting a key node from the tree:\n");
        tree.inOrder();


    }

    //Insert a new Key
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        // if the tree is empty return a new Node
        if (root == null) {
            root = new Node(key);
            return root;
        }
        //otherwise
        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);

        //return the unchanged root pointer
        return root;
    }

    // Search a key in the BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        //Base case: root is null or key is present at root
        if (root == null || root.key == key) return root != null;

        //if key is greater than root key
        if (root.key < key) {
            return searchRec(root.right, key);
        }

        return searchRec(root.left, key);
    }

    void deleteKey(int key) {
        if (search(key))
            root = deleteRec(root, key);
        else throw new NoSuchElementException("No Such Key Present");
    }

    Node deleteRec(Node root, int key) {
        // if the tree is empty
        if (root == null) return root;

        // otherwise recurcive down the tree
        if (key < root.key) root.left = deleteRec(root.left, key);
        else if (key > root.key) root.right = deleteRec(root.right, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            this.left = this.right = null;

        }
    }
}
