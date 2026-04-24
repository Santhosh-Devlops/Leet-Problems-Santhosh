import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) s.add(n);
        List<Integer> l = new ArrayList<>(s);
        Collections.sort(l);
        int n = l.size();
        return n >= 3 ? l.get(n - 3) : l.get(n - 1);
    }
}

