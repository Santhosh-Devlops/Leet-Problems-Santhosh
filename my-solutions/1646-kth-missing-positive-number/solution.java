class Solution {
    public int findKthPositive(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int j=1;j<2050;j++){
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
        for(int i=0;i<l.size();i++){
            if(i==k){
                return l.get(i-1);
            }
        }
        return 0;
    }
}
