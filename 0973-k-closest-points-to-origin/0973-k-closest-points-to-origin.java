class Solution {
    private int dist(int[] p){
        return p[0]*p[0]+p[1]*p[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p=new PriorityQueue<>((a,b) -> dist(b) - dist(a));
        for(int[] pr:points){
            p.add(pr);
            if(p.size()>k){
                p.poll();
            }
        }
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++){
            res[i]=p.poll();
        }
        return res;
    }
}