class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hs=new HashMap<>();
        int l=0,max=0,ans=0;
        for(int r=0;r<s.length();r++){
            hs.put(s.charAt(r),hs.getOrDefault(s.charAt(r),0)+1);
            max=Math.max(max,hs.get(s.charAt(r)));
            //System.out.println(s.charAt(r)+" "+max);
            while(((r-l+1)-max)>k){
                hs.put(s.charAt(l),hs.get(s.charAt(l))-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}