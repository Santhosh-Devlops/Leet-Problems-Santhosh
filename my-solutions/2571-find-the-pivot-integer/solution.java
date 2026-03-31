import java.util.*;
class Solution {
    public int pivotInteger(int n) {
        int idx=-1;
        int tot=(n*(n+1))/2;
        int ret=(int)Math.sqrt(tot);
        if((ret*ret)==tot){
            idx=ret;
        }
        return idx;
    }
}
