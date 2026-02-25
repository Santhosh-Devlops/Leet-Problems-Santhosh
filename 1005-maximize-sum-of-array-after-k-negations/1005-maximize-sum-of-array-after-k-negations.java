class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        for (int a = 0; a < k; a++) {

            int min = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[min]) {
                    min = i;
                }
            }
            nums[min] = -nums[min];
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
