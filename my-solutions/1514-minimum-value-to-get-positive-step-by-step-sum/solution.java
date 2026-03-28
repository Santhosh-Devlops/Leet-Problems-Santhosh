class Solution {
    public int minStartValue(int[] nums) {
        int minVal = 0;
        int total = 0;

        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
            if(total < minVal) { 
                minVal = total;
            }
        }

        return -minVal + 1;
    }
}
