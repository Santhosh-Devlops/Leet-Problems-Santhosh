import java.util.Arrays;
class Solution {
    public int largestAltitude(int[] gain) {
        int[] a=new int[gain.length+1];
        a[0]=0;
        int k=1;
        for(int i=0;i<gain.length;i++){
            a[k++]=a[i]+gain[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
        }
        return max;
    }
}
