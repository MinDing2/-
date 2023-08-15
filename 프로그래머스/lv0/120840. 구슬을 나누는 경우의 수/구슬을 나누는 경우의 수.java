import java.math.BigInteger; 

class Solution {
    public BigInteger solution(int balls, int share) {
        
        
        long bs = balls - share;
        BigInteger b = BigInteger.ONE;
        BigInteger s = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;

        for (int i = 1; i <= balls; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= share; i++) {
            s = s.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= bs; i++) {
            c = c.multiply(BigInteger.valueOf(i));
        }

        s = c.multiply(s);

        BigInteger bal = new BigInteger(String.valueOf(b));
        BigInteger sha = new BigInteger(String.valueOf(s));

        return bal.divide(sha);
    }
}