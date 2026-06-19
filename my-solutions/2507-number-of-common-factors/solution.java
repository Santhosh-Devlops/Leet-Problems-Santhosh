class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        for(int i=1;i<=(Math.max(a,b)/2);i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        if(a==b) c=c+1;
        return c;
    }

}
