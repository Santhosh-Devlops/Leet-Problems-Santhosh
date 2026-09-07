class Solution {
    public long removeZeros(long n) {
        String st="";
        long t=n;
        while(t!=0){
            long r=t%10;
            if(r!=0){
                st+=String.valueOf(r);
            }
            t/=10;
        }
        return Long.parseLong(new StringBuilder(st).reverse().toString());
    }
}