class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans=0;
        List<int[]> hs=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])<=a){
                    hs.add(new int[]{i,j});
                }
            }
        }
        for(int[] x:hs){
            for(int i=0;i<arr.length;i++){
                if(i>x[0] && i>x[1] && Math.abs(arr[x[0]]-arr[i])<=c && Math.abs(arr[x[1]]-arr[i])<=b){
                    ans++;
                }
            }
        }
        return ans;

    }
}