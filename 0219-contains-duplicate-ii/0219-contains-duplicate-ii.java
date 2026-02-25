class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        while(i<nums.length){
            int j=i+1;
            while (j < nums.length && j - i <= k) {
                if(nums[i]==nums[j]){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}