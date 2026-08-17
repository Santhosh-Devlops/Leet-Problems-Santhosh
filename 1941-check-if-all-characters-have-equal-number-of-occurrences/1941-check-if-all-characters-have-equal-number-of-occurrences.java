class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] f=new int[26];
        for (char c:s.toCharArray()) {
            f[c-'a']++;
        }
        int t=f[s.charAt(0)-'a'];
        for (int v:f) {
            if (v>0 && v!=t) {
                return false;
            }
        }
        return true;
    }
}
