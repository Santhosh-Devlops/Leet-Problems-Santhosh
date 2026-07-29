class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int x=n;
        int sum=0,pro=1;
        while(x>0)
        {
            int r=x%10;
            sum+=r;
            pro*=r;
            x/=10;
        }
        int add=sum+pro;
        if(n%add==0) return true;
        return false;
    }
}