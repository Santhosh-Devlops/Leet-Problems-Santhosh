class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int c=0;
        for(int i:nums){
            int t=i;
            while(t<max){
                if(t!=max){
                    t+=1;
                    c++;
                }
            }
        }
        return c;

    }
}