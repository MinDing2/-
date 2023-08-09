import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        //숫자만 떼서 오름차순
        int[] answer = {};
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++){
            if('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z'){
            
            }else{
                cnt++;
            }
        }
        answer = new int[cnt];
        int num = 0;
        for(int i = 0; i < my_string.length(); i++){
            if('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z'){
            
            }else{
                answer[num] = my_string.charAt(i) - 48;
                num++;
            }   
        }
        Arrays.sort(answer);
        return answer;
    }
}