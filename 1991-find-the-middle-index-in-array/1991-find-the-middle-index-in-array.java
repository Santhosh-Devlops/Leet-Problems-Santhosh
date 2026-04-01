class Solution {
    public int findMiddleIndex(int[] arr) {
       int right=0;
       for(int i:arr){
            right+=i;
        }
        int left=0;
        for(int i=0;i<arr.length;i++){
            right-=arr[i];
            if(left==right){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}