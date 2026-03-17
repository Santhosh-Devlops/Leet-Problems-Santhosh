class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length,count=0;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++){
            if(grid[i][j]=='1'){
                count++;
                d(grid,i,j);
            }
        }
        return count;
    }
    public void d(char[][] grid,int a,int b){
        if(a<0||b<0||a>=grid.length||b>=grid[0].length||grid[a][b]=='0'){
            return;
        }
        else{
            grid[a][b]='0';
            d(grid,a+1,b);
            d(grid,a-1,b);
            d(grid,a,b+1);
            d(grid,a,b-1);
        }
    }
}
