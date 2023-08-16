import java.util.*;

class Solution {
    public int[] solution(int[] arr){
        List<Integer> stk = new ArrayList<>();                  
        int[] answer = {};
                                      
        for(int i = 0; i < arr.length; i++){           
            if(stk.size() == 0){
                 stk.add(arr[i]);
            }else if(stk.get(stk.size() - 1) == arr[i]){
                stk.remove(stk.size() - 1);
            }else if(stk.get(stk.size() - 1) != arr[i]){
                stk.add(arr[i]);
            }
        }
        
        if(stk.isEmpty()){
            stk.add(-1);
        }
        
        answer = new int[stk.size()];
        for(int i = 0 ; i < stk.size(); i++){
            answer[i] = stk.get(i);
        }
                                      
        return answer;
    }
}