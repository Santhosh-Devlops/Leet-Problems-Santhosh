import java.math.*;
class Solution {
    int ans=0;
    private boolean issquare(int n){
        if(n==0 || n==1) return true;
        int r=(int)Math.sqrt(n);
        if(r*r == n) return true;
        return false;
    }
    private int solve(int[] nums,boolean[] vis,List<Integer> t){
        if(t.size()==nums.length){
            ans++;
            return ans;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue;
            if(hs.contains(nums[i])) continue;
            if(t.size()==0 || issquare(t.get(t.size()-1)+nums[i])){
                vis[i]=true;
                hs.add(nums[i]);
                t.add(nums[i]);
                solve(nums,vis,t);
                t.remove(t.size()-1);
                vis[i]=false;
            }
        }
        return -1;
    }
    public int numSquarefulPerms(int[] nums) {
        List<Integer> t=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        Arrays.sort(nums);
        solve(nums,vis,t);
        return ans;   
    }
}
