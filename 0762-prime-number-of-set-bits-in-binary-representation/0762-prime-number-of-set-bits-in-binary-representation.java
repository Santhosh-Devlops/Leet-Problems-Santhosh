class Solution {
    int c=0;
    public int countPrimeSetBits(int left, int right) {
        for(int i=left;i<=right;i++){
            int count=0;
            int t=i;
            while(t>0){
                int r=t&1;
                if(r==1){
                    count++;
                }
                t=t>>1;
            }
            if(prime(count)){ 
                System.out.println(count);
                c++;
            }
        }
        return c;
    }
    boolean prime(int n){
        if(n<2)return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}