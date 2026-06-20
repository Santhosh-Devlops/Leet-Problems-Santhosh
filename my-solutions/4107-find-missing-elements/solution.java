class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int k=0;
        int max=nums[nums.length-1];
        for(int j=min;j<=max;j++){
            boolean f=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==j){
                    f=true;
                }
            }
            if(!f){
                l.add(j);
            }
        }
        return l;
    }
}
