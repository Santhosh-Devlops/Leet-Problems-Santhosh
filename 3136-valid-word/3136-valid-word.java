class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)return false;
        int v=0,c=0;
        for(char ch:word.toCharArray()){
            if(Character.isDigit(ch))continue;
            if(!Character.isLetter(ch))return false;
            if("aeiouAEIOU".indexOf(ch)!=-1)v++;
            else c++;
        }
        return v>0 && c>0;
    }
}
