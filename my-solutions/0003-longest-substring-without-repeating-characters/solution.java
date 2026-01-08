class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashSet<Character> h=new HashSet<>();
        int i=0,count=0,max=0,j=0;
        while(i<s.length()){
            if(!h.contains(s.charAt(i))){
                h.add(s.charAt(i));
                i++;
                count++;
                if(!(count<max)) max=count;
            }
            else{
                h.remove(s.charAt(j));
                j++;
                count--;
            }
        }
        return max;
    }
}
