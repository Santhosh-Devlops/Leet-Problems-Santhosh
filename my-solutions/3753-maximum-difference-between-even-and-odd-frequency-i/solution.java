class Solution {
    public int maxDifference(String s) {
        int max=Integer.MIN_VALUE;
        int[] freq=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(char i='a';i<='z';i++){
            for(char j='a';j<='z';j++){
                if(freq[j-'a']>0 && freq[i-'a']>0){
                    if(freq[j-'a']%2==0 && freq[i-'a']%2!=0 && i!=j){
                        max=Math.max(max,freq[i-'a']-freq[j-'a']);
                    }
                }
            }
        }
        return max;
    }
}
