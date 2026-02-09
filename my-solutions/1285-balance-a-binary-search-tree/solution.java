/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<TreeNode> nodes = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return buildTree(0, nodes.size() - 1);
    }
    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        nodes.add(root);
        inorder(root.right);
    }
    public TreeNode buildTree(int start, int end) {

        if (start > end) return null;
        int mid = (start + end) / 2;

        TreeNode root = nodes.get(mid);
        root.left = buildTree(start, mid - 1);
        root.right = buildTree(mid + 1, end);

        return root;
    }
}
