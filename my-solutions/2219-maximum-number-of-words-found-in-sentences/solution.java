class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] arr=new int[101];
        int k=0;
        int n=sentences.length;
        for(int i=0;i<n;i++){
            String[] toks=sentences[i].split(" ");
            arr[k++]=toks.length;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
