class Solution {
    public int sumOfPrimesInRange(int n) {
        StringBuilder s=new StringBuilder();
        s.append(String.valueOf(n));
        String r=s.reverse().toString();
        int rev=Integer.parseInt(r);
        boolean flag=true;
        int min=Math.min(n,rev);
        int max=Math.max(n,rev);
        int sum=0;
        for(int i=min;i<=max;i++){
            if(primes(i)){
                sum+=i;
            }
        }
        return sum;

    }
    private boolean primes(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
