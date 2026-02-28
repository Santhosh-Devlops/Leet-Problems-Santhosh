class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr=new int[101];
        int k=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            arr[k++]=sum;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
