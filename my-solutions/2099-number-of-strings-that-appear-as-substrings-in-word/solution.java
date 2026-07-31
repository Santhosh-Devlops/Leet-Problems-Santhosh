class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        if(patterns.length==1 && !word.contains(patterns[0])){
            return 0;
        }
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                c++;
            }
        }
        return c;
    }
}
