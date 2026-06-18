class Solution {
    public String truncateSentence(String s, int k) {
        String[] a=new String[s.length()];
        String t="";
        a=s.split(" ");
        for(int i=0;i<k;i++){
            t+=a[i];
            if(i!=k-1){
                t+=" ";
            }
        }
        return t;
    }
}
