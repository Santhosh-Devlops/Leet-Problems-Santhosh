class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        int k=0;
        for(int i=0;i<=n;i++){
            if(i==0) arr[i]=i;
            int count=0;
            int t=i;
            while(t>0){
                if(t%2==1){
                    count++;
                }
                t=t/2;
            }
            arr[i]=count;
        }
        return arr;
    }
}
