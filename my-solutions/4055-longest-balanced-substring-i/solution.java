class Solution {
    public int longestBalanced(String s) {
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int[] cnt=new int[26];
            for(int j=i;j<n;j++){
                cnt[s.charAt(j)-'a']++;
                HashSet<Integer> set=new HashSet<>();
                for(int c:cnt){
                    if(c>0) set.add(c);
                }
                if(set.size()==1){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}
