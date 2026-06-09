class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long sum=0;
        if(nums.length==0) return 0;
        int m=Integer.MIN_VALUE;
        int mi=Integer.MAX_VALUE;
        for(int t=nums.length-1;t>=0;t--){
            m=Math.max(m,nums[t]);
            mi=Math.min(mi,nums[t]);
        }
        sum+=(m-mi);        
        return sum*k;
    }
}
