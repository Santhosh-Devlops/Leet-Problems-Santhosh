class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permute(nums,0,res);
        return res;
    }
    private void permute(int[] nums,int start,List<List<Integer>> res){
        if(start==nums.length){
            List<Integer> li=new ArrayList<>();
            for(int n:nums) li.add(n);
            res.add(li);
            return;
        }

        HashSet<Integer> h=new HashSet<>();
        for(int i=start;i<nums.length;i++){

            if(h.contains(nums[i])) continue;
            h.add(nums[i]);
            
            int temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;

            permute(nums,start+1,res);

            temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
        }
    }
}
