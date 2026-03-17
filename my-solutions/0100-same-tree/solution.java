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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> qp=new ArrayList<>();
        List<Integer> qs=new ArrayList<>();
        storeinlist(p,qp);
        storeinlist(q,qs);
        return qp.equals(qs);
    }
    private void storeinlist(TreeNode root,List<Integer> l){
        if(root==null) { l.add(null); return;}
        l.add(root.val);
        storeinlist(root.left,l);
        storeinlist(root.right,l);
    }
}
