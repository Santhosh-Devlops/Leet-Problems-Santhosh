class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        HashMap<Character,Integer> hs=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            sum+=Math.abs(i-hs.get(t.charAt(i)));
        }
        return sum;
    }
}