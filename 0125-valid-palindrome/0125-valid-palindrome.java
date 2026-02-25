class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(null)){
            return true;
        }
        String r=s.replaceAll("[^a-zA-Z0-9]", "");
        String t=r.toLowerCase();
        StringBuilder st=new StringBuilder(t);
        if((st.reverse().toString()).equals(t)){
            return true;
        }
        else{
            return false;
        }
    }
}