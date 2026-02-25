class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int l=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                arr[l]=i;
                l++;
            }
        }
        for(int j=0;j<l-1;j++){
            if(arr[j+1]-arr[j]-1 < k) return false;
        }
        return true;
    }
}