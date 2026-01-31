class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[nums.length];
        int i=0,k=0,j=n;
        while(i<nums.length && j<nums.length && k<nums.length){
            a[k++]=nums[i++];
            a[k++]=nums[j++];
        }
        return a;
    }
}
