class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        boolean[] ex=new boolean[n+1];
        for(int i=0;i<n;i++){
            ex[nums[i]]=true;
        }
        int j=1;
        while(j<=n){
            if(!ex[j]){
                l.add(j);
            }
            j++;
        }
        return l;
    }
}