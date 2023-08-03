class Solution {
    public int solution(int angle) {
        int answer = 0;  
        
        int num = 0; 
    		
        if(angle > 0  && angle < 90){
     	    num = 1;
        }else if(angle == 90){
      	    num = 2;
        }else if(angle > 90  && angle < 180){
           	num = 3 ;
        }else if(angle == 180){
        	num = 4;
        } 
        
           switch(num){
           case 1:
               answer = 1;
               break;
           case 2:
               answer = 2;
               break;
           case 3:
               answer = 3;
               break;
           case 4:
               answer = 4;
               break; 
         } 
        
        return answer;  
                   
    }
}