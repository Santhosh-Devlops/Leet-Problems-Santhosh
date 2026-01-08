class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int i=0,sum=0;
        while(i<nums.length){
            if((i - k < 0 || nums[i] > nums[i - k])&&(i + k>=nums.length || nums[i] > nums[i+k])){
                sum+=nums[i];
            }
            i++;
        }
        return sum;
    }
}
