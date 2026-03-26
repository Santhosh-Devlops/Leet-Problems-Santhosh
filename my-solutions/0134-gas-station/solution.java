class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int csum=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            int diff=(gas[i]-cost[i]);
            sum+=diff;
            csum+=diff;
            if(csum<0){ 
                csum=0; 
                index=i+1;
            }
        }
        if(sum>=0){
            return index;
        }
        else{
            return -1;
        }
    }
}
