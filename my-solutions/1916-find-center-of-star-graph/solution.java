class Solution {
    public int findCenter(int[][] edges) {
        int n=0;
        for(int i=0;i<edges.length-1;i++){
            for(int j=0;j<2;j++){
                if((edges[i][j]==edges[i+1][0]) || (edges[i][j]==edges[i+1][1])){
                    n=edges[i][j];
                }
            }
        }
        return n;
    }
}
