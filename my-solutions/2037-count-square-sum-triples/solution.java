class Solution {
    public int countTriples(int n) {
        int cnt=0;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(i*i);
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(l.contains((i*i)+(j*j))){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
