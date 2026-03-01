class Solution {
    public int jump(int[] nums) {
        int j=0;
        int e=0;
        int f=0;
        for(int i=0;i<nums.length-1;i++){
            f=Math.max(f,i+nums[i]);
            if(i==e){
                j+=1;
                e=f;
            }
        }
        return j;
    }
}