class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int a=0;
        for(int i:arr){
            a=Math.min(a+1,i);
        }
        return a;
    }
}