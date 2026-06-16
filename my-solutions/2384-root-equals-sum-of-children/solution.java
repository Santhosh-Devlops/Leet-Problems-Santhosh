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
    public boolean checkTree(TreeNode root) {
        int sum=0,value=0,value1=0;
        sum=root.val;
        value=root.left.val;
        value1=root.right.val;
        System.out.println(value+" "+value1);
        if(sum==(value+value1)) return true;
        return false;
    }
}
