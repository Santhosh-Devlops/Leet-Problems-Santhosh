import java.util.*;
class Solution {
    public int[] sortArray(int[] nums) {
        int[] a=new int[nums.length];
        int k=0;
       PriorityQueue<Integer> p=new PriorityQueue<>();
       for(int i=0;i<nums.length;i++){
            p.add(nums[i]);
       }
       while(!p.isEmpty()){
        a[k++]=p.poll();
       }
       return a;
    }
}
