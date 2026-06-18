class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] a=new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int k=0;
        for(int i:h.keySet()){
            if(h.get(i)==2){
                a[k++]=i;
            }
        }
        Arrays.sort(a);
        return a;
    }
}
