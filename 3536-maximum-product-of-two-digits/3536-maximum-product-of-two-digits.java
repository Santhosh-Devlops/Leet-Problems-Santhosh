class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int mul=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                int o=s.charAt(i)-'0';
                int o1=s.charAt(j)-'0';
                mul=Math.max(mul,o*o1);
            }
        }
        return mul;
    }
}