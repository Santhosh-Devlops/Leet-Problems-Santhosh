class Solution {
    int sum=0;
    public int subsetXORSum(int[] nums) {
        dfs(nums,0,0);
        return sum;
    }
    void dfs(int[] nums,int i,int x){
        if(i==nums.length){
            sum+=x;
            return;
        }
        dfs(nums,i+1,x^nums[i]);
        dfs(nums,i+1,x);
    }
}