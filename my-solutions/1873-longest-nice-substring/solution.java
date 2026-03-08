class Solution {
    public String longestNiceSubstring(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String t=s.substring(i,j);
                boolean f=true;
                for(int k=0;k<t.length();k++){
                    char c=t.charAt(k);
                    if(t.indexOf(Character.toLowerCase(c))==-1 || t.indexOf(Character.toUpperCase(c))==-1){
                        f=false;
                        break;
                    }
                }
                if(f && t.length()>r.length()){
                    r=t;
                }
            }
        }
        return r;
    }
}
