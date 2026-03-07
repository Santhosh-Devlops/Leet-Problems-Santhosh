class Solution {
    public boolean isPowerOfFour(int n) {
        System.out.println((n&(n-1)));
        if(((n&(n-1))==0) && n>0 && ((n%3)== 1)) return true;
        return false;
    }
}