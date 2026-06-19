class Solution {
    public String generateTheString(int n) {
        String t="";
        for(int i=0;i<n;i++){
            if(n%2!=0){
                t+='a';
            }
        }
        if(!t.equals("")) return t;
        String s="";
        for(int i=0;i<n-1;i++){
            s+='a';
        }
        s+='b';
        return s;
    }
}
