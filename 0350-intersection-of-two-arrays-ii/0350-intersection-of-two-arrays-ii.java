class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        int m=Math.min(nums1.length,nums2.length);
        int[] arr=new int[m];
        while(i<nums1.length && j<nums2.length && k<m){
            if(nums1[i]==nums2[j]){
                System.out.println(nums1[i]);
                arr[k++]=nums1[i];
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOfRange(arr,0,k);
    }
}