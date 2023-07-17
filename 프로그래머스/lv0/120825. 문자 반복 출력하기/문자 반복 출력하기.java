import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        //문자열 my_string과 정수 n 
        //my_string에 들어있는 각문자를 n만큼 반복한 문자
        //열을 return 하도록 solution 함수를 완성
        int cnt = 0;
        String anw ="";
        String match = "[^a-z-A-Z]";
        String[] answer = new String[my_string.length() * n];

        
        
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){   
                answer[i + cnt] = my_string.substring(i, i + 1);
                cnt++;
            } 
            cnt -=1;
        }
    
        String answerToString = Arrays.toString(answer);
        

        anw = answerToString.replaceAll(match,"");
        
        return anw;
    }
}