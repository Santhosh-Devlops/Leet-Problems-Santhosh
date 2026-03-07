class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag=true;
        int i;
        
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                flag=false;
            }
        }
        return flag;

    }
}