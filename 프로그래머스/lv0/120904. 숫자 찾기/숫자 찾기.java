import java.util.*; 
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        
        for(int i = 0; i < str.length(); i++){
            if( str.charAt(i) == k + 48){
                 answer = i + 1;
                 break;
            }else {
                answer = -1;
            }
        }    
        return answer;
    }
}