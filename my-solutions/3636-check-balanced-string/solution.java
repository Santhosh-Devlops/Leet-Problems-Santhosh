class Solution {
    public boolean isBalanced(String num) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            int a=c-'0';
            if(i%2==0){
                sum1+=a;
            }
            else{
                sum2+=a;
            }
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }
}
