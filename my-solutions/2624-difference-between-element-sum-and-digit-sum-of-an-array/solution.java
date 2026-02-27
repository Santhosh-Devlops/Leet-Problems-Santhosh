class Solution {
    public int differenceOfSum(int[] nums) {
        int sumbits=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(nums[i]>0){
                int r=nums[i]%10;
                sumbits+=r;
                nums[i]/=10;
            }
        }
        int diff=sum-sumbits;
        return diff;
    }
}
