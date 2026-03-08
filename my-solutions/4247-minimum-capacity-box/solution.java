class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i<capacity.length;i++){
            if(min>capacity[i] && (capacity[i]>itemSize || capacity[i]==itemSize)){
                min=capacity[i];
                pos=i;
            }
        }
        return pos;
    }
}
