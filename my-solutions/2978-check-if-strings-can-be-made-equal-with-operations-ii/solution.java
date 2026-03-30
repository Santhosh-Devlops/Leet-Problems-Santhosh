import java.util.Arrays;

class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        char[] e1 = new char[(n + 1) / 2];
        char[] e2 = new char[(n + 1) / 2];
        char[] o1 = new char[n / 2];
        char[] o2 = new char[n / 2];

        int ep = 0, op = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                e1[ep] = s1.charAt(i);
                e2[ep] = s2.charAt(i);
                ep++;
            } else {
                o1[op] = s1.charAt(i);
                o2[op] = s2.charAt(i);
                op++;
            }
        }

        Arrays.sort(e1);
        Arrays.sort(e2);
        Arrays.sort(o1);
        Arrays.sort(o2);

        return Arrays.equals(e1, e2) && Arrays.equals(o1, o2);
    }
}

