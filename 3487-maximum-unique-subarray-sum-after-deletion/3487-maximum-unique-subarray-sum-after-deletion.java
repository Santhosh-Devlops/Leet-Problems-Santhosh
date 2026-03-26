class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        if(nums.length==1) return nums[0];
        boolean flag=true;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>=0){
                flag=false;
            }
            max=Math.max(max,i);
        }
        if(flag) return max;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]) && nums[i]>0){
                hs.add(nums[i]);
            }    
        }
        int sum=0;
        for(int i:hs){
            sum=Math.max(sum,sum+i);
            max=Math.max(max,sum);
        }
        return max;
        
    }
}