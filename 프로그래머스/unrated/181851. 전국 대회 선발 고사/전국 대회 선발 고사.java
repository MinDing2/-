import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        List<Integer> arr = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();
     
        //true 인거 arr 에 추가 
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                arr.add(rank[i]);         
            }
        }
        //오름 차순 
         Collections.sort(arr);
        
        if(arr.size() == 1){
           for(int i = 0; i < 1; i++){
            for(int j = 0; j < rank.length; j++){
                if(arr.get(i) == rank[j]){
                    idx.add(j);
                }
              }
           }
          a =  idx.get(0);
        }
        
        if(arr.size() == 2){
           for(int i = 0; i < 2; i++){
            for(int j = 0; j < rank.length; j++){
                if(arr.get(i) == rank[j]){
                    idx.add(j);
                }
              }
           }
          a = idx.get(0);
          b = idx.get(1);
        }
        
        if(arr.size() != 0 || arr.size() != 1 || arr.size() != 2){
          for(int i = 0; i < 3; i++){
            for(int j = 0; j < rank.length; j++){
                if(arr.get(i) == rank[j]){
                    idx.add(j);
                }
              }
           }
          a = idx.get(0);
          b = idx.get(1);
          c = idx.get(2);
        }
        
    
        answer = 10000 * a + 100 * b + c;
        
        
        return answer;
    }
}