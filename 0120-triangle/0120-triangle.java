import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] d = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            List<Integer> r = triangle.get(i);
            for (int j = 0; j < r.size(); j++) {
                d[j] = r.get(j) + Math.min(d[j], d[j + 1]);
            }
        }
        return d[0];
    }
}
