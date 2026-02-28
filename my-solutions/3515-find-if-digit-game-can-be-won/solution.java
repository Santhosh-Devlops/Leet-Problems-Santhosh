class Solution {
    public boolean canAliceWin(int[] nums) {
        int s = 0, d = 0, t = 0;
        for (int n : nums) {
            if (n < 10) s += n;
            else if (n > 9 && n < 100) d += n;
            t += n;
        }
        return s > (t - s) || d > (t - d);
    }
}

