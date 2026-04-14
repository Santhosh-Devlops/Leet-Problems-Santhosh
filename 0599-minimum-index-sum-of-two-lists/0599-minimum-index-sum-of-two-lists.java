class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {
        HashMap<String, Integer> hs = new HashMap<>();
        for (int i = 0; i < l1.length; i++) {
            for (int j = 0; j < l2.length; j++) {
                if (l1[i].equals(l2[j])) hs.put(l1[i], i + j);
            }
        }

        String[] a = new String[l1.length];
        int k = 0, min = Integer.MAX_VALUE;

        for (String s : hs.keySet()) {
            int sum = hs.get(s);
            if (sum < min) {
                min = sum;
                k = 0;
                a[k++] = s;
            } else if (sum == min) {
                a[k++] = s;
            }
        }

        String[] res = new String[k];
        for (int i = 0; i < k; i++) res[i] = a[i];
        return res;
    }
}
