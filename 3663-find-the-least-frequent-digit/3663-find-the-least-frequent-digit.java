import java.util.*;
class Solution 
{
    public int getLeastFrequentDigit(int n) 
    {
        int arr[]=new int[10];
        List<Integer> l=new ArrayList<>();
        while(n>0)
        {
            int r=n%10;
            arr[r]++; 
            n/=10;
        }
        int max=Integer.MAX_VALUE;
        for(int i=0;i<10;i++)
        {
            if(arr[i]>0)
            {
                max=Math.min(max,arr[i]);
            }
        }
        for(int i=0;i<10;i++)
        {
            if(max==arr[i])
            {
                l.add(i);
            }
        }
        int a=Collections.min(l);
        return a;
    }
}