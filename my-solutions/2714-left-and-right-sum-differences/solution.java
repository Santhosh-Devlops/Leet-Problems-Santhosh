class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length];
        int[] fin=new int[nums.length];
        int sum=0,rsum=0;
        int k=1,l=1,o=0;
        a[0]=sum;
        b[0]=rsum;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            System.out.println(sum);
            if(k<nums.length) a[k++]=sum;
        }
        for(int i=nums.length-1;i>0;i--){
            rsum+=nums[i];
            System.out.println(rsum);
            if(l<nums.length) b[l++]=rsum;
        }
        for(int i=0;i<nums.length;i++){
            fin[o++]=Math.abs(a[i]-b[b.length-i-1]);
            System.out.println(Math.abs(a[i]-b[b.length-i-1]));
        }
        return fin;
    }
}
