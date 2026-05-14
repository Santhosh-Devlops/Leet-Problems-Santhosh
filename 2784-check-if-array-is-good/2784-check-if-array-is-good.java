class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=(i+1)){
                return false;
            }
            i++;
        }
        if(nums[nums.length-1]!=(nums.length-1)) return false;
        return true;
    }
}