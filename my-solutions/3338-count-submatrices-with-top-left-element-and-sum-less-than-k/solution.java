class Solution {
    public int countSubmatrices(int[][] grid,int k){
        int r=grid.length;
        int c=grid[0].length;

        int[][] pre=new int[r][c];
        int count=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                pre[i][j]=grid[i][j];

                if(i>0) pre[i][j]+=pre[i-1][j];
                if(j>0) pre[i][j]+=pre[i][j-1];
                if(i>0 && j>0) pre[i][j]-=pre[i-1][j-1];

                if(pre[i][j]<=k) count++;
            }
        }

        return count;
    }
}
