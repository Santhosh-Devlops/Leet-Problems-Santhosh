class Solution {
    public int minElement(int[] nums) {
        for(int  i=0;i<nums.length;i++){
            int sum=0;
            int temp=nums[i];
            while(temp!=0){
                int r=temp%10;
                sum+=r;
                temp/=10;
            }
            nums[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}
