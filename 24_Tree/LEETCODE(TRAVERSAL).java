public class LEETCODE(TRAVERSAL){
    // Post Order Traversal in java
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root , res);
        return res;
    }

    public void postOrder(TreeNode root , List<Integer> res){
        if(root == null) return ;
        postOrder(root.left , res);
        postOrder(root.right , res);
        res.add(root.val);
    }

    // pre Order Traversal in java
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root , res);
        return res;
    }

    public void preOrder(TreeNode root , List<Integer> res){
        if(root == null) return ;
        res.add(root.val);
        preOrder(root.left , res);
        preOrder(root.right , res);
    }

    // in Order Traversal in java
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root , res);
        return res;
    }

    public void inOrder(TreeNode root , List<Integer> res){
        if(root == null) return ;
        inOrder(root.left , res);
        res.add(root.val);
        inOrder(root.right , res);
    }
}