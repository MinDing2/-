import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        
        Arrays.sort(arr);
        answer = new String(arr);
        StringBuffer ar = new StringBuffer(answer);
        answer = ar.reverse().toString();
        
        return answer;
    }
}