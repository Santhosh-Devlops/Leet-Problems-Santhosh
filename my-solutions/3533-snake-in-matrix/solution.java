class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] grid=new int[n][n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=k++;
            }
        }
        int c=grid[0][0];
        for(int i=0;i<commands.size();i++){
                if(commands.get(i).equals("UP")) c=c-n;
                if(commands.get(i).equals("DOWN")) c=c+n;
                if(commands.get(i).equals("LEFT")) c=c-1;
                if(commands.get(i).equals("RIGHT")) c=c+1;
        }
        return c;
    }
}
