import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int idx = 0;
        List<Integer> ar = new ArrayList<>();
        
        if(arr.length == 1){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        for(int i = 0; i < arr.length; i++){
        
            if(min > arr[i]){
                min = arr[i];
                idx = i;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            ar.add(arr[i]);
        }
        
        ar.remove(idx); 
        
        int[] answer = new int[ar.size()]; 
        for(int i = 0; i < ar.size(); i++){
           answer[i] = ar.get(i);
        }
        
        return answer;
    }
}