class Solution {
    public int totalFruit(int[] f) {
        int a = -1;
        int b = -1;
        int la = 0;
        int cur = 0;
        int max = 0;
        for (int i = 0; i < f.length; i++) {
            int x = f[i];
            if (x == a || x == b) {
                cur++;
            }
            else {
                cur = la + 1;
            }
            if (x == b) {
                la++;
            }
            else {
                la = 1;
            }
            if (x != b) {
                a = b;
                b = x;
            }
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }
}

