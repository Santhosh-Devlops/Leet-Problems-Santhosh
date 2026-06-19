class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int sum=0,max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,d(grid,i,j));
                }
            }
        }
        return max;
    }
    private int d(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length ||j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        return 1+d(grid,i+1,j)+d(grid,i-1,j)+d(grid,i,j+1)+d(grid,i,j-1);
    }
}
