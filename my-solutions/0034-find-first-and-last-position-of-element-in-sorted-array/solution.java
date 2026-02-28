class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        if(nums.length==0) return new int[]{-1,-1};

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                first=i;
                break;
            }
        }
        int max=first;
        if(nums.length==-1) return new int[]{-1,-1};
        for(int i=first+1;i<nums.length;i++){
            if(nums[i]==target){
                max=i;
            }
        }
        return new int[]{first,max};

    }
}
