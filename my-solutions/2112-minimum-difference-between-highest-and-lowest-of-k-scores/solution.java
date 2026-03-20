class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=nums[nums.length-1];
        for(int i=0;i<=nums.length-k;i++){
            if(min>(Math.abs(nums[i+k-1]-nums[i]))){
                min=Math.abs(nums[i+k-1]-nums[i]);
            }
        }
        return min;
    }
}
