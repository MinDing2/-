import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>(); 
        int cnt = 0;
        int cnt1= 0;
        
    for(int i = 0; i < num_list.length; i ++){
        
        if(n == 1){
            // 0 - b
            arr.add(num_list[i]);
            cnt++;
            if( i == slicer[1] ){
                break;
            }
        }else if(n == 2){
            //a - 마지막
            if(i >= slicer[0]){
               arr.add(num_list[i]);
               cnt++;
            }
        }else if(n == 3){
            //a - b
             if(i >= slicer[0] && i <= slicer[1]){
               arr.add(num_list[i]); 
               cnt++;
            }
        }else{
            // a - b 까지 c 간격으로
            if(i >= slicer[0] && i <= slicer[1] && cnt1 % slicer[2] == 0){
               arr.add(num_list[i]); 
                cnt++;
            }
            if(i >= slicer[0] && i <= slicer[1]){
                cnt1++;
            }
        }   
    }
        
        answer = new int[cnt];
        
        for(int i = 0; i < cnt; i++){
            answer[i] = arr.get(i);
        }
        
        return answer;

    }
}