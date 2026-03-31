class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] a=new int[5001];
        int k=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.size();i++){
            for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                a[k++]=j;
                System.out.println(j);
            }
        }  
        for(int i=0;i<a.length;i++){
            if(!h.contains(a[i]) && a[i]!=0){
                h.add(a[i]);
                System.out.println(a[i]);
            }
        }
        return h.size();
    }
}
