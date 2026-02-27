class Solution {
    public int countDigits(int num) {
        int count=0;
        int k=num;
        while(num>0){
            int r=num%10;
            
            if((k%r)==0){
                count++;
                System.out.println(r+count);
            }
            
            num=num/10;
        }
        return count;
    }
}
