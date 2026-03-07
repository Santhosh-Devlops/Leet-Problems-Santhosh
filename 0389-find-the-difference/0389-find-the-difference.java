class Solution {
    public char findTheDifference(String s, String t) {
        int diff=0,n1=0,n2=0;
        for(int i=0;i<s.length();i++){
            n1+=((int)s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            n2+=((int)t.charAt(i));
        }
        diff=n2-n1;
        return (char)diff;
    }
}