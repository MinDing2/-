class Solution {
    public int[] solution(int n, int m) { 
       
        int[] answer = new int[2];
        int rest = 0; 
        int bigNumber = 0; 
        int smallNumber = 0;
        
        if(n == m){
            bigNumber   = n;
            smallNumber = n; 
        }else if(n > m){
            bigNumber   = n;
            smallNumber = m;
        }else{
            bigNumber   = m; 
            smallNumber = n; 
        }
        
        int maxValue = bigNumber;
        int minValue = smallNumber;
        
        rest = bigNumber; 
        
        if( maxValue == minValue){
            answer[0] = bigNumber;
            answer[1] = bigNumber;  
        }else if( maxValue % minValue == 0){
            answer[0] = minValue;
            answer[1] = maxValue;
        }else{
            while(rest != 0){
                rest        = bigNumber % smallNumber; 
                bigNumber   = smallNumber;             
                smallNumber = rest;                    
            }
            answer[0] = bigNumber;  
            answer[1] =  (maxValue * minValue) / bigNumber ; //여기 문제  bigNumber ->최대 공약수 * 최대값
        }
        return answer;
    }
}