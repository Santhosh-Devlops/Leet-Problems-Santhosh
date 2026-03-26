import java.util.*;
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> st=new HashSet<>();
        int n=s.length();
        int t=(int)Math.pow(2,k);
        for(int i=0;i<=n-k;i++){
            String sub=s.substring(i,i+k);
            st.add(sub);
            if(st.size()==t) return true;
        }
        return false;
    }
}

