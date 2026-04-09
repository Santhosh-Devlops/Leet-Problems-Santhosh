class Solution {
    public int getSum(int a, int b) {
        int c=0;
        int s=0;
        while(b!=0){
            s=a^b;
            c=(a&b) << 1;
            a=s;
            b=c;
        }
        return a;
    }
}
