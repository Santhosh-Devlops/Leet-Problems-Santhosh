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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        get(root1,l1);
        get(root2,l2);
        return l1.equals(l2);
    }
    private static void get(TreeNode r,List<Integer> l){
        if(r==null){
            return;
        }
        if(r.left==null && r.right==null){
            l.add(r.val);
            return;
        }
        get(r.left,l);
        get(r.right,l);
    }
}