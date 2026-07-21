class Solution {
    public int minOperations(int[] nums) {
        if(nums.length==1) return 0;
        int min=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                min+=(nums[i]-nums[i+1]+1);
                nums[i+1]=nums[i]+1;
            }
        }
        return min;
    }
}
