class Solution {
    public int rob(int[] a) {
        if(a.length == 0) return 0;
        if(a.length == 1) return a[0];
        int p2 = a[0];       
        int p1 = Math.max(a[0], a[1]);    
        for(int i = 2; i < a.length; i++){
            int c = Math.max(p1, a[i] + p2);
            p2 = p1;
            p1 = c;
        }
        return p1;
    }
}
