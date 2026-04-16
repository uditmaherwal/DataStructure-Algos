import java.util.*;

class BinaryTree {

    BinaryTree() {

    }

    public class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.err.println("Enter your root node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to insert left of node " + node.value + " :");
        Boolean left = scanner.nextBoolean();
        if (left) {
            System.err.println("Enter the left node value : ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to insert right of node " + node.value + " :");
        Boolean right = scanner.nextBoolean();
        if (right) {
            System.err.println("Enter the right node value : ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.err.println(indent + node.value);
        display(node.left, "" + "\t");
        display(node.left, "" + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }
}