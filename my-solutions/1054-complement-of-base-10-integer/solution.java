class Solution {
    public int bitwiseComplement(int n) {
        String a="";
        if(n==0) return 1;
        while(n>0){
            int r=n%2;
            a=(r^1)+a;
            n=n/2;
        }
        return Integer.parseInt(a,2);
    }
}
