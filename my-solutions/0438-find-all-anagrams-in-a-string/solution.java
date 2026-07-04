import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
        
        if(s.length()<p.length()) return l;
        char[] sp = p.toCharArray();
        Arrays.sort(sp);
        String st=s.substring(0,p.length());
        if(isA(st, sp)) l.add(0); 
        for(int i=p.length();i<s.length();i++){
            st=st.substring(1)+s.charAt(i);
            if(isA(st,sp)){
                l.add(i-p.length()+1);
            }
        }
        
        return l;
    }
    private boolean isA(String s,char[] sp){
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        return Arrays.equals(sArr,sp);
    } 
}

