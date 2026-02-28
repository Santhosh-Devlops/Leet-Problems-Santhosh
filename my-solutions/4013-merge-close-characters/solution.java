import java.util.*;
class Solution {
    public String mergeCharacters(String s, int k) {
        String v=s;
        StringBuilder b=new StringBuilder(v);
        while(true){
            int t=-1;
            for(int i=0;i<b.length();i++){
                for(int j=i+1;j<b.length()&&j-i<=k;j++){
                    if(b.charAt(i)==b.charAt(j)){
                        t=j;
                        break;
                    }
                }
                if(t!=-1)break;
            }
            if(t==-1)break;
            b.deleteCharAt(t);
        }
        return b.toString();
    }
}

