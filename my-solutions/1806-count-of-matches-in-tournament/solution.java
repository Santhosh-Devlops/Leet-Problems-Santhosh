class Solution {
    public int numberOfMatches(int n) {
        
        int matches=0;
        int advance=0;
        if(n%2!=0){
            matches=(n-1)/2;
            advance=((n-1)/2)+1;
            if(matches>=1){
                return matches+numberOfMatches(advance);
            }
        }
        if(n%2==0){
            matches=n/2;
            advance=n/2;
            if(matches>=1){
                return matches+numberOfMatches(advance);
            }
           
        }
        return 0;
    }
}
