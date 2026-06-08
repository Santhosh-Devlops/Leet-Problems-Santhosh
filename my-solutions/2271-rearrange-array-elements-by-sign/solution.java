class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int i=0,j=1;
        for(int n:nums){
            if(n>0){
                res[i]=n;
                i=i+2;//positive
            }
            else{
                res[j]=n;
                j=j+2;//negatuive
            }
        }
        return res;
    }
}
