class Solution {
    public int countConsistentStrings(String allowed, String[] words){
        int c=0;
        for(int i=0;i<words.length;i++){
            boolean f=true;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                if(allowed.indexOf(ch)==-1){
                    f=false;
                    break;
                }
            }
            if(f){
                c++;
            }
        }
        return c;
    }
}