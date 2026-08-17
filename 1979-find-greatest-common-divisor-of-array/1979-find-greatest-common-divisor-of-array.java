class Solution {
    public int findGCD(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        return gcd(min,max);
    }
    private int gcd(int a,int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}