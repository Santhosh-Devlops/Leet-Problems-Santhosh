class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hs=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            hs.put(heights[i],names[i]);
        }
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length-i-1;j++){
                if(heights[j]<heights[j+1]){
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                }
            }
        }
        String[] s1=new String[heights.length];
        for(int i=0;i<heights.length;i++){
            s1[i]=hs.get(heights[i]);
        }
        return s1;
    }
}
