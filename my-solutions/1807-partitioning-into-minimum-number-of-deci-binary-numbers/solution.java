class Solution {
    public int minPartitions(String n) {
        int a=0;
        for(int i=0;i<n.length();i++) {
            int l=n.charAt(i)-'0';
            a=Math.max(l,a);
        }
        return a;
    }
}
