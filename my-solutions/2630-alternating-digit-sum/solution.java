class Solution {
    public int alternateDigitSum(int n) {
        int num=0;
        String s=String.valueOf(n);
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                num-=s.charAt(i)-'0';
            }
            else{
                num+=s.charAt(i)-'0';
            }
        }
        return num;
    }
}
