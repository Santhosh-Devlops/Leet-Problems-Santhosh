class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int d=0;
        int[] arr=new int[2];
        for(int i=0;i<nums1.length;i++){
            int c=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    c++;
                }
            }
            if(c>0) d++;
        }
        arr[0]=d;
        d=0;
        for(int i=0;i<nums2.length;i++){
            int c=0;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    c++;
                }
            }
            if(c>0) d++;
        }
        arr[1]=d;
        return arr;
    }
}
