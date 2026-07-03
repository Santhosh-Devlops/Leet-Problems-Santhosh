class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> l=new ArrayList<>();
        if(s.length()%k==0){
            for(int i=0;i<s.length();i+=k){
                if((i+k)<=s.length()){
                    l.add(s.substring(i,i+k));
                }
            }
        }
        else{
            for(int i=0;i<s.length();i+=k){
                if((i+k)<=s.length()){
                    l.add(s.substring(i,i+k));
                }
            }
            String a="";
            for(int i=s.length()-s.length()%k;i<s.length();i++){
                a+=s.charAt(i);
            }
            for(int i=s.length()-s.length()%k+1;i<s.length()+(k-s.length()%k);i++){
                if(i>=s.length()){
                    a+=fill;
                }
                
            }
            l.add(a);
        }
        int jkl=0;
        String[] st=new String[l.size()];
        for(String i:l){
            st[jkl++]=i;
        }
        return st;
    }
}
