import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> lt = Arrays.stream(arr)
            .boxed()
            .collect(Collectors.toList());
      
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0 && query[i] + 1 < lt.size()){//idx 값 뒤에
                for(int j = query[i] + 1; j < lt.size(); j++){
                        lt.remove(j);
                        j--;
                }
            }else if(i % 2 == 1 && query[i] < lt.size()){
                for(int k = 0; k < query[i]; k++){
                        lt.remove(0);
                    }
                }
            }
    
        int[] answer = new int[lt.size()];
        for(int i = 0; i < lt.size(); i++){
            answer[i] = lt.get(i);
        }
        
        return answer;
    }
}