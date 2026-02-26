class Solution {
    public int binaryGap(int n) {
        int i=0,count=0;
         int pos=-1;
        String s=Integer.toBinaryString(n);
        while(i<s.length()){
            char c=s.charAt(i);
           
            if(c=='1'){
                if(pos!=-1){
                    int gap=i-pos;
                    if(gap>count){
                        count=gap;
                    }
                }
                pos=i;
            }
            i++;
        }
        return count;
        
    }
}