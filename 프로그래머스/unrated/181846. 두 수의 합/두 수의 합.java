import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger c = BigInteger.ONE;
        BigInteger first  = new BigInteger(String.valueOf(a));
        BigInteger second = new BigInteger(String.valueOf(b));
        
        c = first.add(second);
        answer = String.valueOf(c);
        return answer;
    }
}