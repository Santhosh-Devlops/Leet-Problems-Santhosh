class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        int current=1;
        int i=0;
        while (candies>0){
            int giving=Math.min(candies,current);
            arr[i%num_people]+=giving;
            candies-=giving;
            current++;
            i++;
        }
        return arr;
    }
}