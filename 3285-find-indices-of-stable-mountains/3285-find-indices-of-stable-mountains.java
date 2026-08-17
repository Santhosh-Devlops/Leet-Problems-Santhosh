class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=height.length-1;i++){
            if(height[i-1]>threshold){
                l.add(i);
            }
        }
        return l;
    }
}