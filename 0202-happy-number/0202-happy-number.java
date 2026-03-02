class Solution {
    public boolean isHappy(int n) {
      
        int num=n;
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            int sum=0;
            while(num>0){
                int r=num%10;
                sum+=(r*r);
                num/=10;
            }
            return isHappy(sum);
        }
    }
}