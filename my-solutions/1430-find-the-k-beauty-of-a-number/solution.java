class Solution {
    public int divisorSubstrings(int num, int k) {
        int c=0;
        String n=Integer.toString(num);
        for(int i=0;i<=n.length()-k;i++){
            String t=n.substring(i,i+k);
            int ch=Integer.parseInt(t);
            if(ch!=0 && num%ch==0){
                c++;
            }
        }
        return c;
    }
}
