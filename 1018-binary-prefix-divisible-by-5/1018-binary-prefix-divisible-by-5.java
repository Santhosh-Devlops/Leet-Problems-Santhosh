class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=(c*2 + nums[i])%5;
            if(c==0){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}