import java.util.*;
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> l=new ArrayList<>();
        Map<String,List<String>> m=new HashMap<>();
        for(int i=0;i<paths.length;i++){
            String[] sub=paths[i].split(" ");
            String r=sub[0];
            for(int j=1;j<sub.length;j++){
                int o=sub[j].indexOf("(");
                int c=sub[j].indexOf(")");
                String s=sub[j].substring(o+1,c);
                String fn=sub[j].substring(0,o);
                if(!m.containsKey(s)){
                    m.put(s,new ArrayList<>());
                }
                m.get(s).add(r+"/"+fn);
            }
        }
        for(List<String> st:m.values()){
            if(st.size()>1){
                l.add(st);
            }
        }
        return l;
    }
}
