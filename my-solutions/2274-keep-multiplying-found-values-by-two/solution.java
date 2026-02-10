class Solution {
    public int findFinalValue(int[] nums, int original) {

        int k = original;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == k) {
                    k = k * 2;
                    flag = true;
                    break;
                }
            }
        }
        return k;
    }
}

