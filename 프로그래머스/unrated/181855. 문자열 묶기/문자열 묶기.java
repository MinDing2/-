import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] num = new int[strArr.length];
        int[] len = new int[31];
        //Arrays.fill(len, 0);
        for(int i = 0; i < strArr.length; i++){
            num[i] = strArr[i].length();
            for(int j = 1; j <= 30; j++){
                if(num[i] == j){
                    len[j]++;
                    if(answer < len[j]){
                        answer = len[j];
                    }
                }
            }    
        } 
        
        return answer;
                
    }
}
