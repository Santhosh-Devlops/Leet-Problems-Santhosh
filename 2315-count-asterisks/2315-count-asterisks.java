class Solution {
    public int countAsterisks(String s) {
        int sum=0;
        int val=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='|'){
                val++;
            }
            else if(val%2==0 && c=='*'){
                sum++;
            }
        }
        return sum;
    }
}