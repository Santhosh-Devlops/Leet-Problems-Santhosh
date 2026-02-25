import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer, List<Integer>> m = new HashMap<>();
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int b = Integer.bitCount(arr[i]);
            if (!m.containsKey(b)) {
                m.put(b, new ArrayList<>());
            }
            m.get(b).add(arr[i]);
        }
        int[] a = new int[m.size()];
        int k = 0;
        for (int b : m.keySet()) {
            a[k++] = b;
        }
        Arrays.sort(a);

        int c = 0;
        for (int i = 0; i < a.length; i++) {
            List<Integer> l = m.get(a[i]);
            Collections.sort(l);
            for (int val : l) {
                result[c++] = val;
            }
        }

        return result;
    }
}
