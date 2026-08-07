class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i:h.keySet()){
            l.add(h.get(i));
        }
        int[] arr=new int[k];
        Collections.sort(l);
        Collections.reverse(l);
        List<Integer> l1=new LinkedList<>();
        for(int i=0;i<k;i++){
            l1.add(l.get(i));
        }
        int o=0;
        for(int i:h.keySet()) {
            int f=h.get(i);
            if(l1.contains(f)) {
                arr[o++]=i;
                l1.remove(Integer.valueOf(f));
                if(o==k) { 
                    break;
                }
            }
        }
        return arr;
    }
}
