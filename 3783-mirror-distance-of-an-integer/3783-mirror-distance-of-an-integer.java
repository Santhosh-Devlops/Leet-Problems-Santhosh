class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    private int reverse(int n){
        String a="";
        while(n>0){
            int r=n%10;
            a+=r;
            n=n/10;
        }
        int res=Integer.parseInt(a);
        return res;

    }
}