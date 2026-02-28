class Solution {
    public String firstPalindrome(String[] words) {
        String st="";
        for(int i=0;i<words.length;i++){
            StringBuilder s=new StringBuilder(words[i]);
            if(s.reverse().toString().equals(words[i])){
                st=words[i];
                break;
            }
        }
        return st;
    }
}