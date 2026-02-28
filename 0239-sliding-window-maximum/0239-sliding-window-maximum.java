class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int m = -1;

        for (int i = 0; i <= n - k; i++) {
            int e = i + k - 1;
            if (m >= i) {
                if (nums[e] >= nums[m]) m = e;
            } else {
                m = i;
                for (int j = i + 1; j <= e; j++) {
                    if (nums[j] >= nums[m]) m = j;
                }
            }
            res[i] = nums[m];
        }
        return res;
    }
}
