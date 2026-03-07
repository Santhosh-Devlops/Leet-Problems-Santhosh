class Solution {
    public int missingNumber(int[] nums) {
        short n=(short)nums.length;
        int e=n*(n+1)/2;
        int a=0;
        for(int n1:nums){
            a+=n1;
        }
        return e-a;
    }
}
