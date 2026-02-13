class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> h=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!h.contains(c)) {h.add(c); count++;}
        }
        return count;
    }
}
