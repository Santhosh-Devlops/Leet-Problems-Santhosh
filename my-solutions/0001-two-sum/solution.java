class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        int sum;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target && i!=j){
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        return a;
    }
}
