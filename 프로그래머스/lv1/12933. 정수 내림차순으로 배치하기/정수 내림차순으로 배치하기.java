import java.lang.Math;
import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        long[] arr = new long[str.length()];
        
        for(int i = 0; i < str.length(); i++ ){
            arr[i] = str.charAt(i) - 48; 
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            answer += arr[i] * Math.pow(10,i);
        }
        
        return answer;
    }
}