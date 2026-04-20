class Solution {
    public int maxDistance(int[] colors) {
        int res=0,n=colors.length,i=0,j=0;
        while(colors[0]==colors[n-1-i]){
            i++;
        }
        res=Math.max(res,n-1-i);
        while(colors[n-1]==colors[j]){
            j++;
        }
        res=Math.max(res,n-1-j);
        return res;
    }
}
