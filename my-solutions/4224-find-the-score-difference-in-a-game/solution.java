class Solution {
    public int scoreDifference(int[] nums) {
        
        int f = 0;
        int s = 0;
        boolean a = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                a = !a;
            }
            if (i % 6 == 5) {
                a = !a;
            }
            if (a) {
                f += nums[i];
            } else {
                s += nums[i];
            }
        }
        return f - s;
    }
}
