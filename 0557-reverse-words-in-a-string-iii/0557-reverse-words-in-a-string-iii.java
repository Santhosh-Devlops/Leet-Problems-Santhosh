class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        String st="";
        for(int i=0;i<a.length;i++){
            String sp=new StringBuilder(a[i]).reverse().toString();
            st+=sp;
            if(i!=a.length-1){
                st+=" ";
            }
        }
        return st;
    }
}