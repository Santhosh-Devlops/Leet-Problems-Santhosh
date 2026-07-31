class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int c=0;
        String st="";
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(j!=i && !st.contains(words[j]) && words[i].equals(new StringBuilder(words[j]).reverse().toString())){
                    c++;
                    st+=words[i];
                }
            }
        }
        return c;
    }
}
