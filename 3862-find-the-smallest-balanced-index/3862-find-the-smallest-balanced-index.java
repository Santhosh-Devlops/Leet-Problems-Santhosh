class Solution {
    public int smallestBalancedIndex(int[] nums){
        int n=nums.length;
        long[] suf=new long[n+1];
        suf[n]=1;
        for(int i=n-1;i>=0;i--){
            if(suf[i+1] > (long)1e14/nums[i]){
                suf[i]=(long)1e14+1;
            }
            else{
                suf[i]=suf[i+1]*nums[i];
            }
        }
        long left=0;
        for(int i=0;i<n;i++){
            long right=suf[i+1];
            if(left==right){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}