import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {

        int[] freq = new int[1001];
        List<Integer> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int num : nums[i]) {
                freq[num]++;
            }
        }

        for (int i = 1; i <= 1000; i++) {
            if (freq[i] == n) {
                result.add(i);
            }
        }
        return result;
    }
}
