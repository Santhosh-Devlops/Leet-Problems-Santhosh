class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        int i = 2, j = 3, k = 5;
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
            }
            else if (n % j == 0) {
                n = n / j;
            }
            else if (n % k == 0) {
                n = n / k;
            }
            else {
                return false;
            }
        }
        return n==1;
    }
}
