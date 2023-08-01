

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        double len = 0;
        //거듭 제곱수랑 길이가 같으면 그대로 집어넣는코드
        for(int i = 0; i < 100; i++){
         while(arr.length / Math.pow(2.0, i) == 1){     
             answer = new int[arr.length];
             for(int j = 0; j < arr.length; j++){
                 answer[j] = arr[j];    
             }
             return answer; 
          }   
        }     
        
        //기존 배열 길이가 작으면 큰거랑 맞춰서 뒤에는 0넣는코드
        for(int i = 0; i < 100; i++){//시간 에러뜨는 코드 확인 
            while(arr.length / Math.pow(2.0,i) < 1){   
             len = Math.pow(2.0, i);
             answer = new int[(int)len];
             for(int j = 0; j < arr.length; j++){
                 answer[j] = arr[j];    
             }
             for(int k = arr.length; k < len ; k++){
                 answer[k] = 0;
             }
             return answer;
          }    
        }
        //예외 코드를 작성하시오 
        
          return answer;
        
     
        
    }
}