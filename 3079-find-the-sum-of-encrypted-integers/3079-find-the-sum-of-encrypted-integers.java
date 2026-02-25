class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int max = 0;
            int o = 0;
            while (num > 0) {
                max = Math.max(max, num % 10);
                o = o * 10 + 1;  
                num /= 10;
            }
            sum += max * o;
        }
        return sum;
    }
}
