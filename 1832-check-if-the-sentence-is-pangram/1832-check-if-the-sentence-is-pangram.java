class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            h.add(sentence.charAt(i));
        }
        if(h.size()==26) return true;
        return false;
        
    }
}