class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums,int target) {
        dfs(nums,0,0,target);
        return count;
    }
    void dfs(int[] nums,int i,int sum,int target){
        if(i==nums.length){
            if(sum==target){
                count++;
            }
            return;
        }
        dfs(nums,i+1,sum+nums[i],target);
        dfs(nums,i+1,sum-nums[i],target);
    }
}