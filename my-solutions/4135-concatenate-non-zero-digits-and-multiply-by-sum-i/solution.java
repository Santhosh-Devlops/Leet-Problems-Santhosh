class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        long a=0;
        StringBuilder s=new StringBuilder();
        int sum=0;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            if(r!=0){
                sum+=r;
                s.append(r);
                System.out.println(s);
            }
            temp=temp/10;
        }
        return Long.parseLong(s.reverse().toString())*sum;
    }
}
