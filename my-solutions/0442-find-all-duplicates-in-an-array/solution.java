class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int[] freq=new int[100009];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                l.add(i);
            }
        }
        return l;
    }
}
