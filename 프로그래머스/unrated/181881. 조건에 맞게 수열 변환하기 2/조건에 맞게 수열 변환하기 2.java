class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0; 
        int[] arrCopy = new int[arr.length]; 
        boolean tr = true; 
         
        while(true){
            
            //조건 copy 넣기
           for(int i = 0; i < arr.length; i++){
              if(arr[i] >= 50 && arr[i] % 2 == 0){
                  arrCopy[i] = arr[i] / 2;
              }else if(arr[i] < 50 && arr[i] % 2 == 1){
                  arrCopy[i] = arr[i] * 2 + 1;
              }else{
                  arrCopy[i] = arr[i];
              }
           } 
         
            //다른게 있으면 false
           for(int i = 0; i < arr.length; i++){
              if(arr[i] != arrCopy[i]){
                    tr = false; 
              }
           }
            
           cnt++; 
            
           if(tr){
               answer = cnt - 1; 
               break;
           }
            
            for(int i = 0; i < arr.length; i++){
               arr[i] = arrCopy[i];
           }    
           tr = true; 
        }
        
        return answer;
    }
}