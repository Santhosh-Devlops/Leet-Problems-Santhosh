class Solution {
    public boolean hasAlternatingBits(int n){
        int p=n%2;
        n=n/2;
        while(n>0){
            int b=n%2;
            if(p==b){
                return false;
            }
            p=b;
            n=n/2;
        }
        return true;
    }
}
