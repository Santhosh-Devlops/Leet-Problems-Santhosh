class Solution {
    public int distributeCandies(int[] candyType) {
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            if(!hs.contains(candyType[i])){
                hs.add(candyType[i]);
            }

        }
        if(hs.size()<=(candyType.length/2)){
            return hs.size();
        }
        return (candyType.length/2);
    }
}