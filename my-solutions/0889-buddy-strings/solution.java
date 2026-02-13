class Solution {
    public boolean buddyStrings(String s, String g) {

        if (s.length() != g.length()) return false;
        int c = 0;
        int a = -1, b = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != g.charAt(i)) {
                c++;
                if (c == 1) a = i;
                if (c == 2) b = i;
                if (c > 2) return false;
            }
        }
        if (c == 2) {
            return s.charAt(a) == g.charAt(b) && s.charAt(b) == g.charAt(a);
        }
        if (c == 0) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) return true;
                }
            }
        }
        return false;
    }
}

