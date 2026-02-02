class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a=new int[2];
        int i=0,j=1,sum=0,num=0;
        Arrays.sort(nums);
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                a[0]=nums[i];
            }
            sum+=nums[i];
            System.out.println(sum);
            i++;
            j++;
        }
        sum+=nums[nums.length-1];
        int r=((nums.length)*(nums.length+1))/2;
        a[1]=r-(sum-a[0]);
        return a;
    }
}
