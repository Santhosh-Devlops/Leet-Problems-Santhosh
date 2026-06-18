class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=0;
        int t=x;
        while(t!=0){
            int r=t%10;
            num+=r;
            t=t/10;
        }
        if((x%num)==0) return num;
        else return -1;
    }
}
