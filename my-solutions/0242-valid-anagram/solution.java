class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toLowerCase().replace("//s","").toCharArray();
        char[] b=t.toLowerCase().replace("//s","").toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
