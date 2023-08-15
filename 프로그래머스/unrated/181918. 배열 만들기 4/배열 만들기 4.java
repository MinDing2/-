import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
       
        List<Integer> stk = new ArrayList<>();
            
        for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < stk.size(); j++){
              if(stk.get(stk.size() - (j + 1)) >= arr[i]){ 
                    stk.remove(stk.size() - (j + 1));
                    j--;
                }
            }
            if(stk.size() == 0){
                stk.add(arr[i]);
            }else if(stk.get(stk.size() - 1) < arr[i]){
                stk.add(arr[i]);
            }
        }
        
        int[] answer = new int[stk.size() ];
        
        for(int i = 0; i < stk.size(); i++){
            answer[i] = stk.get(i);
        }
        
        return answer;
        
    }
}