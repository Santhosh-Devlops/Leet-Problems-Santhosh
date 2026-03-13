class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums.length%j==0){
                sum+=(nums[i]*nums[i]);
            }
            j++;
        }
        return sum;
    }
}