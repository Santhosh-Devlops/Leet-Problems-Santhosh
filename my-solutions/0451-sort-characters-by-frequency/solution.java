class Solution {
    public String frequencySort(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
        }

        char[] u = new char[256];
        int k = 0;
        for (int i = 0; i < 256; i++) {
            if (f[i] > 0) {
                u[k++] = (char) i;
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - 1 - i; j++) {
                if (f[u[j]] < f[u[j + 1]]) {
                    char t = u[j];
                    u[j] = u[j + 1];
                    u[j + 1] = t;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            char c = u[i];
            int n = f[c];
            for (int j = 0; j < n; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

