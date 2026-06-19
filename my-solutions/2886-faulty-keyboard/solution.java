class Solution {
    public String finalString(String s) {
        String t="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                String l="";
                for(int j=t.length()-1;j>=0;j--){
                    l+=t.charAt(j);
                }
                t=l;
            }
            else{
                t+=s.charAt(i);
            }
        }
        return t;
    }
}

