class Solution {
    String counted(String a){
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<a.length()){
            int count=1;
            while (i + 1 < a.length() && a.charAt(i) == a.charAt(i + 1)) {
                count++;
                i++;
            }
            str.append(count).append(a.charAt(i));
            i++;

        }
        return str.toString();
    }
    public String countAndSay(int n) {
        if(n==1) return "1";
        String rle="1";
        int c=1;
        while(c<n){
            rle=counted(rle);
            c++;
        }
        return rle;
    }
}
