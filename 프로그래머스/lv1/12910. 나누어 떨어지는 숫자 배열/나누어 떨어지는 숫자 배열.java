import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> arrCopy = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0 ){
                arrCopy.add(arr[i]);
            }
        }
        if(arrCopy.size() == 0){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }else{
        int[] answer = new int[arrCopy.size()];
        
        for(int i = 0; i < answer.length; i++){
              answer[i] = arrCopy.get(i); 
            }
            Arrays.sort(answer);
            return answer;
        }
        
        
    }
}