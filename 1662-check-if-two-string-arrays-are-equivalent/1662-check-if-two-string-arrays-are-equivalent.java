class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String e="";
        String f="";
        for(int i=0;i<word1.length;i++){
            e+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            f+=word2[i];
        }
        return e.equals(f);
    }
}