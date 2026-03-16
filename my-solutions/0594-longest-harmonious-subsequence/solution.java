class Solution{
    public int findLHS(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]) count++;
                else if(nums[j]==nums[i]+1){count++;found=true;}
            }
            if(found) max=Math.max(max,count);
        }
        return max;
    }
}
