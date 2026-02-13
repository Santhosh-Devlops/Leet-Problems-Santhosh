import java.util.HashMap;
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                return nums[i];
            }
            h1.put(nums[i],1);
        }
        return -1;
    }
}
