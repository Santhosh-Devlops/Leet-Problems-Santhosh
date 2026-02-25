class Solution {
    public String reverseByType(String s) {
        int n = s.length();
        char[] letters = new char[n];
        char[] specials = new char[n];
        int letter = 0;
        int special = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters[letter] = ch;
                letter++;
            } else {
                specials[special] = ch;
                special++;
            }
        }
        char[] result = new char[n];
        int letteri = letter - 1;
        int speciali = special - 1;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[i] = letters[letteri];
                letteri--;
            } else {
                result[i] = specials[speciali];
                speciali--;
            }
        }
        return new String(result);
    }
}
