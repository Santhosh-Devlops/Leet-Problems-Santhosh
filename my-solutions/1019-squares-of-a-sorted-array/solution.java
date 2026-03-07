class Solution {
    public int[] sortedSquares(int[] n) {
        int i=0, j=n.length-1, p=j, r[]=new int[n.length];
        while(i<=j) {
            int a=n[i]*n[i], b=n[j]*n[j];
            if(a>b) { r[p--]=a; i++; }
            else { r[p--]=b; j--; }
        }
        return r;
    }
}

