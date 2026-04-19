class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] v=nums;
        int[] s=new int[n];
        s[n-1]=v[n-1];
        for(int i=n-2;i>=0;i--){
            s[i]=Math.min(s[i+1],v[i]);
        }
        int m=v[0];
        for(int i=0;i<n;i++){
            if(v[i]>m){
                m=v[i];
            }
            if((m-s[i])<=k){
                return i;
            }
        }
        return -1;
    }
}
