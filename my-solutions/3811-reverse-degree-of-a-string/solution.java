class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int j=0;j<s.length();j++){
            sum+=((('a'+'z'-s.charAt(j))-'a'+1)*(j+1));
        }
        return sum;
    }
}
