class Solution {
    public boolean isPowerOfThree(int n) {
        boolean f=false;
        for(int i=0;i<=19;i++){
            if(Math.pow(3,i)==n){
                f=true;
            }
        }
        return f;

    }
}
