class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                st.push(s.charAt(i));
            }
            if(Character.isDigit(s.charAt(i))){
                st.pop();
            }
        }
        String l="";
        if(!st.isEmpty()){
            for(char i:st){
                l+=i;
            }
            return l;
        }
        return "";
        
    }
}
