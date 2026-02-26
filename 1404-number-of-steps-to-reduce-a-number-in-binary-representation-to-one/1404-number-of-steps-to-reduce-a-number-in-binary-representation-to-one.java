import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        int count=0;
        BigInteger b=new BigInteger(s,2);
        System.out.println(b);
        while (!b.equals(BigInteger.ONE)) {
            if (b.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                b = b.divide(BigInteger.valueOf(2));
            } else {
                b = b.add(BigInteger.ONE);
            }
            count++;
        }
        return count;
    }
}