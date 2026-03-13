class Solution {
    public int sumOddLengthSubarrays(int[] arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++) sum+=arr[i];
        for(int k=3;k<=n;k+=2){
            int sum1=0;
            for(int i=0;i<k;i++) sum1+=arr[i];
            sum+=sum1;
            for(int i=k;i<n;i++){
                sum1+=(arr[i]-arr[i-k]);
                sum+=sum1;
            }
        }
        return sum;
    }
}
