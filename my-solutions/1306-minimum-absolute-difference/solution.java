import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> l=new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int d = Math.abs(arr[i]-arr[i+1]);
            if(d<min){
                min = d;
            }
        }
        System.out.println(min);
        for(int i=0;i<arr.length-1;i++){
            int d = Math.abs(arr[i]-arr[i+1]);
            if(d == min){
                l.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return l;
    }
}
