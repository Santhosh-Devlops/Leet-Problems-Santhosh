class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] a=new int[code.length];
        if(k==0) return a;
        for(int i=0;i<code.length;i++){
            if(k>0){
                for(int j=1;j<=k;j++){
                    a[i]+=code[(i+j)%code.length];
                }
            }
            else{
                for(int j=1;j<=-k;j++){
                    a[i]+=code[(i-j+code.length)%code.length];
                }
            }
        }
        return a;
    }
}