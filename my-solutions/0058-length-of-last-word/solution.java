class Solution {
    public int lengthOfLastWord(String s) {
        int k=0;
        String[] t = s.split("[ ,!]+");
        return t[t.length-1].length();
    }
}
