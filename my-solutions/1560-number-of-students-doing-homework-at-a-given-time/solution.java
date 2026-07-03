class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt=0;
        if(startTime.length==1 && queryTime==startTime[0]) return 1;
        for(int i=0;i<endTime.length;i++){
            if(startTime[i]<=queryTime && queryTime<=endTime[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
