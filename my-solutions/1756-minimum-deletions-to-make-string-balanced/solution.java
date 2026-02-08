class Solution {
    public int minimumDeletions(String s) {
        int d = 0, e = 0;
        for (char c : s.toCharArray()) {
            if (c == 'b') e++;
            else if (e > 0) {
                d++;
                e--;
            }
        }
        return d;
    }
}
