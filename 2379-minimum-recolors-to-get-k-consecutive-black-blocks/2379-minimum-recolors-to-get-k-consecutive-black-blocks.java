class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=k;
        for(int i=0;i<=blocks.length()-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='B'){
                    count++;
                }
            }
            if(min>(Math.abs(k-count))){
                min=Math.abs(k-count);
            }
        }
        return min;
    }
}