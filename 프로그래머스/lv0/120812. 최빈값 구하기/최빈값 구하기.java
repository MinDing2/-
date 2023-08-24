import java.util.*; 
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt = 0; 
        int idx = 0;
        int[] space = new int[array.length];
        Arrays.fill(space, 0); 

        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] == array[j]){
                    space[i] += 1;
                }
            }
        }
        
        int max = space[0]; 
        
        for(int i = 0; i < array.length; i++){
            if(max < space[i]){
                max = space[i];
                idx = i;
            }
        }
        
        for(int i = 0; i < array.length; i++){
             if(max == space[i]){
                  cnt++;
              }
            }
        
        if(cnt >= 2){
            answer = -1;
        }else{
            answer = array[idx]; 
        }
        return  answer;
    }
}