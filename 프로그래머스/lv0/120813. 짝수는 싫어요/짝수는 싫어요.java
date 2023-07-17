import java.util.Arrays; 

class Solution {
    public int[] solution(int n) {
        //n 이하의 홀수가 오름차순으로 담긴 
        //배열을 리턴
        int ct = 0;
        int cnt = 0;
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1)
            {
                ct++; 
            }
        }
        
        int[] answer = new int[ct];
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1)
            {
                answer[cnt] = i;
                cnt++; 
            }
        }

        return answer;
        
    }
}