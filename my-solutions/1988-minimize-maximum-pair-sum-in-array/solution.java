class Solution {
    public int minPairSum(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<(nums.length/2);i++){
            max=Math.max(max,nums[nums.length-i-1]+nums[i]);
        }
        return max;
    }
}
