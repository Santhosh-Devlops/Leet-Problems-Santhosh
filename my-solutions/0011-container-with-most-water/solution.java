class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int ma=0;
        int end=height.length-1;
        while(start < end){
            int h=Math.min(height[start],height[end]);
            int width = end-start;
            int area= h*width;
            ma=Math.max(ma,area);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ma;
    }
}
