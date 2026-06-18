class Solution {
    public boolean areNumbersAscending(String s) {
        String[] a=new String[s.length()];
        List<Integer> l=new ArrayList<>();
        a=s.split(" ");
        for(int i=0;i<a.length;i++){
            if(a[i].matches("\\d+")) { 
                l.add(Integer.parseInt(a[i]));
            }
        }
        List<Integer> l2=new ArrayList<>(l);
        for(int i=0;i<l2.size()-1;i++){
            if(l2.get(i)>=l2.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
