import java.util.*;
class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int min=1000000007;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                min=Math.min(min,i-m.get(nums[i]));
            }
            int n=nums[i],r=0;
            while(n>0){
                r=r*10+n%10;
                n/=10;
            }
            m.put(r,i);
        }
        return min==1000000007?-1:min;
    }
}
