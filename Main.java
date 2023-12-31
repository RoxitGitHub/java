package assigment;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode current, int data) {
        if (current == null) {
            return new TreeNode(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }

        return current;
    }

    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(TreeNode current, int data) {
        if (current == null) {
            return false;
        }

        if (data == current.data) {
            return true;
        }

        if (data < current.data) {
            return searchRecursive(current.left, data);
        }

        return searchRecursive(current.right, data);
    }

    public void inorderTraversal() {
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(TreeNode current) {
        if (current != null) {
            inorderTraversalRecursive(current.left);
            System.out.print(current.data + " ");
            inorderTraversalRecursive(current.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal(); // Output: 20 30 40 50 70

        System.out.println("\nSearch for 40: " + bst.search(40)); // Output: Search for 40: true
        System.out.println("Search for 60: " + bst.search(60)); // Output: Search for 60: false
    }
}

