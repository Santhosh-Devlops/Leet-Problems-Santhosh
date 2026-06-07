class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long c=0;
        HashMap<Double,Integer> hs=new HashMap<>();
        for(int i=0;i<rectangles.length;i++){
            Double d=get(rectangles[i]);
            c+=hs.getOrDefault(d,0);
            hs.put(d,hs.getOrDefault(d,0)+1);
        }
        return c;
        
    }
    private Double get(int[] r){
        return (double) r[0]/r[1];
    }
}




