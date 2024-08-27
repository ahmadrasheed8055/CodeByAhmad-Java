import java.util.*;

public class _5_TreeDS {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to build a tree using user input
    static Node BuildTree() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int nodeData = input.nextInt();

        // Base case: if the input is -1, return null (indicates no node)
        if (nodeData == -1) {
            return null;
        }

        // Creating the root node
        Node root = new Node(nodeData);

        System.out.println("Insert at left of " + nodeData + ":");
        root.left = BuildTree();

        System.out.println("Insert at right of " + nodeData + ":");
        root.right = BuildTree();

        return root;
    }

    // Function for pre-order traversal
    static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // Function for level-order traversal
    static void LevelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);


        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current == null) {
                System.out.println("");
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }else{
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }


        }

    }

    static int totalNodes(Node root){
        if (root == null) {
            return 0;
        }

        int left = totalNodes(root.left);
        int right = totalNodes(root.right);

        return left + right + 1;
    }
    public static void main(String[] args) {
        // Building the tree
        Node root = BuildTree();

        // Performing pre-order traversal
        System.out.println("Pre-order Traversal:");
        preOrderTraversal(root);

        // Performing level-order traversal
        System.out.println("Level-order Traversal:");
        LevelOrderTraversal(root);

        System.out.println("Total Nodes:");
        System.out.println(totalNodes(root));
    }
}
