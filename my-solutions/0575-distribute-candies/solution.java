class Solution {
    public int distributeCandies(int[] candyType) {
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int num:candyType){
            if(!hs.contains(num)){
                hs.add(num);
            }

        }
        if(hs.size()<=(candyType.length/2)){
            return hs.size();
        }
        return (candyType.length/2);
    }
}
