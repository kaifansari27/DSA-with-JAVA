public class BasicTree {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Inorder Traversal (Left → Root → Right)
    static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal (Root → Left → Right)
    static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal (Left → Right → Root)
    static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode temp2 = new TreeNode(2);
        TreeNode temp3 = new TreeNode(3);
        TreeNode temp4 = new TreeNode(4);
        TreeNode temp5 = new TreeNode(5);

        root.left = temp2;
        root.right = temp3;
        temp2.left = temp4;
        temp2.right = temp5;

        System.out.print("Inorder Traversal = ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder Traversal = ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder Traversal = ");
        postorder(root);
        System.out.println();
    }
}
