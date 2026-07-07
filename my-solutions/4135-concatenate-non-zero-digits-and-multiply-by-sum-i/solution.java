class Solution {
    public long sumAndMultiply(int n) {
        if(n<10) return (long)(n*n);
        long res=0;
        HashSet<Integer> h=new HashSet<>();
        int sum=0;
        String st="";
        while(n!=0){
            int r=n%10;
            if(r!=0){
                sum+=r;
                st+=r;
            }
            n=n/10;
        }
        String st1=new StringBuilder(st).reverse().toString();

        return (long)(Long.parseLong(st1)*sum);
    }
}
