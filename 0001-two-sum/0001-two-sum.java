class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            System.out.println(c);
            if(hs.containsKey(c)){
                return new int[]{hs.get(c),i};
            }
            hs.put(nums[i],i);
        }
        return new int[0];
    }
}