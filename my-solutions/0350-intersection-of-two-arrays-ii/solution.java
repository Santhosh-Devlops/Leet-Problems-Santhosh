class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        int m=Math.min(l1,l2);
        while(i<l1 && j<l2 && k<m){
            if(nums1[i]==nums2[j]){
                System.out.println(nums1[i]);
                nums1[k++]=nums1[i];
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
        return Arrays.copyOfRange(nums1,0,k);
    }
}
