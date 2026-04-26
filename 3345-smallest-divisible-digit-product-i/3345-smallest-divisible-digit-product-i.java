class Solution {
    public int smallestNumber(int n, int t) {
       
        while(true){
            int prod=func(n);
            if(prod%t==0){
              return n;
            }
            n++;
        }
        
    }
    private int func(int n){
         int prod=1;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            prod*=r;
            temp=temp/10;
        }
        return prod;
    }
}