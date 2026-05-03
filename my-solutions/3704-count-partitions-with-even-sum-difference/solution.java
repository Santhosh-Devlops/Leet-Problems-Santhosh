class Solution {
    public int countPartitions(int[] nums) {
        int t=0;
        for(int x:nums){
            t+=x;
        }
        int l=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            l+=nums[i];
            int r=t-l;
            if(Math.abs(l-r)%2==0){
                count++;
            }
        }
        return count;
    }
}

