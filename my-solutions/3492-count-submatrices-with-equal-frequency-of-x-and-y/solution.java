class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int[] a=new int[grid[0].length];
        int[] b=new int[grid[0].length];
        int over=0;
        for(int i=0;i<grid.length;i++){
            int sr=0,sc=0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='X') sr++;
                else if(grid[i][j]=='Y') sc++;
                a[j]+=sr;
                b[j]+=sc;
                if(a[j]>0 && a[j]==b[j]) over++;
            }
        }
        return over;
    }
}
