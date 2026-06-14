class Solution {
    public int characterReplacement(String s, int k) {
        int[] abc=new int[26];
        int l=0,max=0,ans=0;
        for(int r=0;r<s.length();r++){
            abc[s.charAt(r)-'A']++;
            max=Math.max(max,abc[s.charAt(r)-'A']);
            //System.out.println(s.charAt(r)+" "+max);
            while(((r-l+1)-max)>k){
                abc[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
