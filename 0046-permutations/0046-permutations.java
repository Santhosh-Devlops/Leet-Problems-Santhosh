class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        p(nums,0,res);
        return res;
    }
    private void p(int[] a,int s,List<List<Integer>> res){
        if(s==a.length){
            List<Integer> l=new ArrayList<>();
            for(int n:a) l.add(n);
            res.add(l);
            return;
        }
        for(int i=s;i<a.length;i++){
            int t=a[s];
            a[s]=a[i];
            a[i]=t;

            p(a,s+1,res);
            
            t=a[s];
            a[s]=a[i]; 
            a[i]=t;
        }
    }
}
