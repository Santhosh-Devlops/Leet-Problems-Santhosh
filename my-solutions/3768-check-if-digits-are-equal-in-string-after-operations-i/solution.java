class Solution {
    public boolean hasSameDigits(String s) {
        String t=s;
        while(t.length()>2){
            String n="";
            for(int i=0;i<t.length()-1;i++){
                int r=t.charAt(i)-'0';
                int r2=t.charAt(i+1)-'0';
                int sum=r+r2;
                n+=String.valueOf(sum%10);
                
            }
            t=n;
        }
        if(t.length()==2 && t.charAt(0)==t.charAt(1)) return true;
        return false;
    }
}
