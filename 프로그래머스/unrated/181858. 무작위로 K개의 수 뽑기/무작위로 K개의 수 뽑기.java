import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> arr1 = new ArrayList<>();
        boolean tr = true; 
        int cnt = 0 ; 
        for(int i = 0; i < arr.length; i++){
            
            if(arr1.isEmpty()){ 
                arr1.add(arr[i]);
                cnt++;
            }
            
            for(int j = cnt - 1 ; j >= 0; j--){// 같은게 있으면 false 
                if(arr1.get(j)  == arr[i]){
                    tr = false; 
                }
            }
            
            if(tr){  //같은게 없으니 더해줌 
                arr1.add(arr[i]);
                cnt++;
            }
            tr = true; 
            if(cnt == k){
                break;
            }
        }
        
        for(int i = cnt; i < k; i++){
            arr1.add(-1);
        }
        
        answer = new int[arr1.size()];
        
        for(int i = 0; i < arr1.size(); i++){
            answer[i] = arr1.get(i); 
        }
        
        return answer;
    }
}