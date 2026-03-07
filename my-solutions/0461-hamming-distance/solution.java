class Solution {
    public int hammingDistance(int x, int y) {
        int r=x^y;
        return Integer.bitCount(r);
    }
}
