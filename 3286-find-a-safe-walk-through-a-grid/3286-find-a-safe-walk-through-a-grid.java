import java.util.*;

class Solution {

    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    boolean dfs(int r,int c,List<List<Integer>> grid,int health,int[][] vis){
        if(r<0 || c<0 || r>=grid.size() || c>=grid.get(0).size())
            return false;
        if(grid.get(r).get(c)==1)
            health--;
        if(health<=0)
            return false;
        if(r==grid.size()-1 && c==grid.get(0).size()-1)
            return true;
        if(vis[r][c]>=health)
            return false;
        vis[r][c]=health;
        for(int[] d:dir){
            if(dfs(r+d[0],c+d[1],grid,health,vis))
                return true;
        }
        return false;
    }
    public boolean findSafeWalk(List<List<Integer>> grid,int health){
        int[][] vis=new int[grid.size()][grid.get(0).size()];
        return dfs(0,0,grid,health,vis);
    }
}