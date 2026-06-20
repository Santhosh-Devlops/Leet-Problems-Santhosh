import java.util.ArrayDeque;
import java.util.Deque;
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
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return minDepth(root.right) + 1;
        if(root.right == null) return minDepth(root.left) + 1;
        
        int l = func(root.left);
        int r = func(root.right);
        return Math.min(l, r) + 1;
    }
    
    private int func(TreeNode s){
        if(s == null) return 0;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.addLast(s);
        int c1 = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode c = q.pollFirst();
                if(c.left == null && c.right == null){
                    return c1;
                }
                if(c.left != null){
                    q.addLast(c.left);
                }
                if(c.right != null){
                    q.addLast(c.right);
                }
            }
            c1++;
        }
        return c1;
    }
}

