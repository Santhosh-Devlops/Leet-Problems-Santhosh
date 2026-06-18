class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            int sum=0;
            if(i%2==0 && (String.valueOf(i).length()==1)){
                c++;
            }
            else{
                int temp=i;
                while(temp!=0){
                    int r=temp%10;
                    sum+=r;
                    temp/=10;
                }
                if(sum%2==0){
                    c++;
                }
            }

        }
        return c;
    }
}
