import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> value = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
             if(i > 0 && arr[i] != arr[i - 1]){
                 value.add(arr[i - 1]);
             }
        }
        value.add(arr[ arr.length - 1]);
        int[] answer = new int[value.size()];
          
        for(int i = 0; i < value.size(); i++){
           answer[i] = value.get(i);
        }
        return answer;
    }
}