class Solution {
    public int minimumOR(int[][] grid) {
        int[][] t = grid;
        int res = 0;
        for (int i = 30; i >= 0; i--) {
            int mask = res | ((1 << i) - 1);
            if (!check(t, mask)) {
                res |= (1 << i);
            }
        }
        return res;
    }

    private boolean check(int[][] g, int m) {
        for (int[] r : g) {
            boolean ok = false;
            for (int v : r) {
                if ((v | m) == m) {
                    ok = true;
                    break;
                }
            }
            if (!ok) return false;
        }
        return true;
    }
}

