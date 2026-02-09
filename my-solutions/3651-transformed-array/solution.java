class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int k=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int move=nums[i];
            int pos = ((i + move) % nums.length + nums.length) % nums.length;
            arr[k++]=nums[pos];
        }
        return arr;
    }
}
