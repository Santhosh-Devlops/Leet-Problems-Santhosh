class Solution {
    public long minArraySum(int[] a) {
        HashSet<Integer> h=new HashSet<>();
        for(int x:a) h.add(x);
        long s=0;
        for(int x:a){
            int m=x;
            for(int i=1;i*i<=x;i++){
                if(x%i==0){
                    if(h.contains(i)) m=Math.min(m,i);
                    if(h.contains(x/i)) m=Math.min(m,x/i);
                }
            }
            s+=m;
        }
        return s;
    }
}
