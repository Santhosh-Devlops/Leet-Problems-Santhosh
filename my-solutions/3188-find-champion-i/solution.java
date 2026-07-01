class Solution {
    public int findChampion(int[][] grid) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    hs.put(i,hs.getOrDefault(i,0)+1);
                }
            }
        }
        int max=Integer.MIN_VALUE;
        int val=0;
        for(int i:hs.keySet()){
            max=Math.max(max,hs.get(i));
        }
        for(int i:hs.keySet()){
            if(max==hs.get(i)){
                val=i;
            }
        }
        return val;
    }
}
