package Dsa_in_java.trees;

import java.util.Scanner;

public class BinaryTrees{
    Scanner sc = new Scanner(System.in);

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int value) {
            this.data = value;
        }
    }

    Node root;

    public void populate() {
        System.out.println("Enter the root node value: ");
        int value = sc.nextInt();
        root = new Node(value);
        populateTree(root);
    }

    public void populateTree(Node root) {
        System.out.print("Do you want to insert to the left of " + root.data + "? (1 for yes, 0 for no): ");
        int left = sc.nextInt();
        if (left == 1) {
            System.out.print("Enter the value: ");
            int value = sc.nextInt();
            root.left = new Node(value);
            populateTree(root.left);
        }
        System.out.print("Do you want to insert to the right of " + root.data + "? (1 for yes, 0 for no): ");
        int right = sc.nextInt();
        if (right == 1) {
            System.out.print("Enter the value: ");
            int value = sc.nextInt();
            root.right = new Node(value);
            populateTree(root.right);
        }
    }

    public void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.left, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.data);
        } else {
            System.out.println(node.data);
        }
        display(node.right, level + 1);
    }

    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();
        tree.populate();
        tree.display(tree.root, 0);
    }
}
