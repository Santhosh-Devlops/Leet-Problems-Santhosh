class Solution {
    public int[] runningSum(int[] nums) {
        int[] a=new int[nums.length];
        a[0]=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            a[i]=sum;
        }
        return a;
    }
}