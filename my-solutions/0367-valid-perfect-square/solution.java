class Solution {
    public boolean isPerfectSquare(int num) {
        long k=(long)Math.sqrt(num);
        if(k * k == num){
            return true;
        }
        else{
            return false;
        }
    }
}
