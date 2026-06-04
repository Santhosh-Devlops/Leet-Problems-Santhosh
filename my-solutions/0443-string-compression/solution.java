class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int k = 0;

        while (i < chars.length) {
            char ch = chars[i];
            int cnt = 0;

            while (i < chars.length && chars[i] == ch) {
                cnt++;
                i++;
            }

            chars[k++] = ch;

            if (cnt > 1) {
                String s = String.valueOf(cnt);

                for (int j = 0; j < s.length(); j++) {
                    chars[k++] = s.charAt(j);
                }
            }
        }

        return k;
    }
}
