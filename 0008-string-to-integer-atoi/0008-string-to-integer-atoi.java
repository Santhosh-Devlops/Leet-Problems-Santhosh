class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        int sign = 1;
        int ans = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        while (i < n) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }
            int digit = ch - '0';
            if (ans > 214748364 || (ans == 214748364 && digit > 7)) {
                if (sign == 1) {
                    return 2147483647;
                } else {
                    return -2147483648;
                }
            }
            ans = ans * 10 + digit;
            i++;
        }
        return ans * sign;
    }
}
