class Solution{
    public int minFlips(String s){
        int n=s.length(),d1=0,d2=0,ans=n;
        char[] c=(s+s).toCharArray();
        for(int i=0;i<2*n;i++){
            if(c[i]!=(i%2 == 0?'0':'1')) d1++;
            else d2++;
            if(i>=n){
                if(c[i-n]!=((i-n)%2 == 0?'0':'1')) d1--;
                else d2--;
            }
            if(i>=n-1) {
                if(d1<ans) ans=d1;
                if(d2<ans) ans=d2;
            }
        }
        return ans;
    }
}

