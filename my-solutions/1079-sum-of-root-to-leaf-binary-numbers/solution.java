class Solution {
    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        traverse(root, "");
        return sum;
    }

    private void traverse(TreeNode n, String s) {
        if (n == null) return;
        
        s += n.val;
        
        if (n.left == null && n.right == null) {
            sum += Integer.parseInt(s, 2);
            return;
        }
        
        traverse(n.left, s);
        traverse(n.right, s);
    }
}

