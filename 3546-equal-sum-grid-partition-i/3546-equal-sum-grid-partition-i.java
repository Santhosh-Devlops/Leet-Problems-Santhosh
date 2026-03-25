class Solution {
    public boolean canPartitionGrid(int[][] g) {
        int r=g.length,c=g[0].length;
        long t=0,rs=0,cs=0;
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)t+=g[i][j];
        if(t%2!=0)return false;
        long target=t/2;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c;j++)rs+=g[i][j];
            if(rs==target)return true;
        }
        for(int j=0;j<c-1;j++){
            for(int i=0;i<r;i++)cs+=g[i][j];
            if(cs==target)return true;
        }
        return false;
    }
}
