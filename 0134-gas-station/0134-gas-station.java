class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0,tc=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc){
            return -1;
        }
        int g=0;
        int idx=0;
        for(int i=0;i<gas.length;i++){
            g+=gas[i]-cost[i];
            if(g<0){
                g=0;
                idx=i+1;
            }
        }
        return idx;
    }
}