class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[] un = Arrays.stream(nums).distinct().toArray(); 
        if(Arrays.equals(nums,un)){
            return false;
        }
        else{
            return true;
        }
    }
}
