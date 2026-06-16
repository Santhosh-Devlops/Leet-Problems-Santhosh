class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<10 && i%i==0){
                l.add(i);
            }
            else{
                String number=String.valueOf(i);
                int cnt=0,size=number.length();
                int num=i;
                while(num!=0){
                    int r=num%10;
                    if(r>0 && r<10 && i%r==0){
                        cnt++;
                    }
                    num=num/10;
                }
                if(cnt==size) l.add(i);
            }
        }
        return l;
    }
}
