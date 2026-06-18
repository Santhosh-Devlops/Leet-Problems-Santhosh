class Solution {
    public boolean isAcronym(List<String> words, String s) 
    {
        if(words.size()!=s.length())
        {
            return false;
        }
        String b="";
        for(String a:words)
        {
            b+=a.charAt(0);
        }
        if(b.equals(s)) return true;
        return false;
    }
}
