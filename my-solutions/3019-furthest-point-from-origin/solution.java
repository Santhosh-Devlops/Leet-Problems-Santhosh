class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int val1=0,val=0,rem=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                val1=val1+1;
            }
            else if(moves.charAt(i)=='R'){
                val=val+1;
            }
            else{
                rem=rem+1;
            }
        }
        return Math.abs(val1-val)+rem;
    }
}
