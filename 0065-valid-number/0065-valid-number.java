class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean d=false, e=false, dot=false;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c>='0'&&c<='9') d=true;
            else if(c=='.'){
                if(dot||e) return false;
                dot=true;
            }
            else if(c=='e'||c=='E'){
                if(e||!d) return false;
                e=true; d=false;
            }
            else if(c=='+'||c=='-'){
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') return false;
            }
            else return false;
        }
        return d;
    }
}
