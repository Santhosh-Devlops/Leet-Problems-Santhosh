class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                if((nums[i]%10)==digit){
                    tot++;
                }
                nums[i]/=10;
            }
        }
        return tot;
    }
}
