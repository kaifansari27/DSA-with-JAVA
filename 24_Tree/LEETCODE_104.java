// maximum-depth-of-binary-tree

public class LEETCODE_104{
    public int maxDepth(TreeNode root) {
        if(root== null) return 0 ;
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        while (true) {
            
            int count = q.size();
            if (count == 0)
                return level;

            while (count > 0) {
                TreeNode elem = q.poll();
                if (elem.left != null) {
                    q.add(elem.left);
                }
                if (elem.right != null) {
                    q.add(elem.right);
                }
                count--;
            }
            level++;
        }
    }
}