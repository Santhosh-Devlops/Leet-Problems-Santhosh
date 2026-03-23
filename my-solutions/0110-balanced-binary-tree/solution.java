class Solution {
    public boolean isBalanced(TreeNode root) {
        boolean[] t={true};
        check(root,t);
        return t[0];
    }
    private int check(TreeNode r,boolean[] t){
        if(r==null){
            return 0;
        }
        int lh=check(r.left,t);
        int rh=check(r.right,t);

        if(Math.abs(lh-rh)>1){
            t[0]=false;
        }
        return Math.max(lh,rh)+1;
    }
}

