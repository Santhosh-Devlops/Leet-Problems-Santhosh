import java.util.*;
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> ks = new ArrayList<>(map.keySet());
        Collections.sort(ks);
        for (int i = 0; i < ks.size(); i++) {
            for (int j = i + 1; j < ks.size(); j++) {
                int x = ks.get(i);
                int y = ks.get(j);
                if (!map.get(x).equals(map.get(y))) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

