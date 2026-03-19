class Solution {
    public int minimumTime(String s) {
        int g=0,m=s.length();
        if(s.equals(null)) return 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                g=Math.min(g+2,i+1);
            }
            m=Math.min(m,g+(s.length()-1-i));
        }
        return m;
    }
}