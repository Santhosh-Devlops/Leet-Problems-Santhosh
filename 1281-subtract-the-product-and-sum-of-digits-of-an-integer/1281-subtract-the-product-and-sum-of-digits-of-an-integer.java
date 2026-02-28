class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
        int t=n;
        while(t>0){
            int r=t%10;
            p*=r;
            s+=r;
            t=t/10;
        }
        return p-s;
    }
}