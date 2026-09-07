class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int t:h.values()){
           if(t<=1) continue;
            boolean b=true;
            for(int i=2;i<=t/2;i++){
                if(t%i==0){ b=false; break;}
            }
            if(b) return true;
        }
        return false;
    }
    
}