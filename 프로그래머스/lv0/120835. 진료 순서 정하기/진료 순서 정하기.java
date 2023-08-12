import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] space = new int[emergency.length];
        int[] answer = new int[emergency.length];
     
        for(int i = 0; i < emergency.length; i++){
            space[i] = emergency[i];     
        }

        Arrays.sort(space);
             
        for(int i = 0; i < emergency.length; i++){ 
          for(int j = 0; j < emergency.length; j++){
            if(space[i] == emergency[j]){
                answer[j] = emergency.length - i;
            }     
          }   
        }
        
        return answer;
    }
}