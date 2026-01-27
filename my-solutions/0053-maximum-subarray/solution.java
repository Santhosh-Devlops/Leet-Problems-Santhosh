class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs=Math.max(nums[i],nums[i]+cs);
            max=Math.max(cs,max);
        }
        return max;
    }
}
