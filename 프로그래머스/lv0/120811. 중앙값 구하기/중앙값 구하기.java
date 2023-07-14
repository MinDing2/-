import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        //array 배열 중앙값
        //return
         double num = 0;
         int answer = 0;
    
         Arrays.sort(array);
     
    
        num = array.length / 2.0 - 0.5;
        
        answer = array[(int)num];
        
        return answer;
    }
}