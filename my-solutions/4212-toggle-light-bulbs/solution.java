class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i:bulbs){
            if(!h1.contains(i)){
                h1.add(i);
            }
            else{
                h1.remove(i);
            }
        }
        List<Integer> in=new ArrayList<>(h1);
        Collections.sort(in);
        return in;
    }
    
}
