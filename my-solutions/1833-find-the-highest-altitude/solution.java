import java.util.Arrays;
class Solution {
    public int largestAltitude(int[] gain) {
        int[] a=new int[gain.length+1];
        a[0]=0;
        for(int i=0;i<gain.length;i++){
            a[i+1]=a[i]+gain[i];
            System.out.println(a[i+1]);
        }
        Arrays.sort(a);
        return a[a.length-1];
    }
}
