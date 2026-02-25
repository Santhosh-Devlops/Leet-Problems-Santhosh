class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int k=0,count=0;
        LinkedList<Integer> s=new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]))
            {
                s.add(nums[i]);
                nums[k]=nums[i];
                k++;
            }
        }
        int m=s.size();
        /**for(int i : s)
        {
            nums[k++]=i;
        }**/
        return m;
    }
}