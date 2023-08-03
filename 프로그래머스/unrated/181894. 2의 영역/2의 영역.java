class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
            int a = 0;
            int c = 0;
            int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
             if(arr[i] == 2 && cnt == 0){
                  a = i;
                  cnt = 1;
               }
             if(a < i && arr[i] == 2 && cnt != 0){
                  c = i;
              }
           }
        
         cnt = 0;
        
        if(c != 0){
         for(int i = a; i <= c; i++){
              cnt++;
         }
        }else{
            cnt = 1; 
        }
        
         answer = new int[cnt];
         cnt = 0;       
              
         if(a == 0 && c == 0){
              answer[cnt] = -1;
         }else if(c == 0){
             answer[cnt] = arr[a];
         }else{
             for(int i = a; i <= c; i++){
                 answer[cnt] = arr[i];
                 cnt++;
             }
        }
        
        return answer;    
    }
}