class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        boolean fs = false; 
        int sum  = 0; 
        int sum1 = 0;
        int sum2 = 0;

        for(int i =  0; i < bin1.length(); i++){    
	           sum1 += (bin1.charAt(i) - 48) * Math.pow(2, bin1.length() - (1 + i));
	        }
	        
	        for(int i =  0; i < bin2.length(); i++){    
	           sum2 += (bin2.charAt(i) - ('0')) * Math.pow(2, bin2.length() - (1 + i));
	        }
     
        sum = sum1 + sum2;
         
        if(sum == 0){
            answer = "0";
        }
        
        for(int i = 10; i >= 0; i--){	            
	            if( sum >= Math.pow(2,i) ){ 
	                answer += "1";
	                sum -= Math.pow(2, i);
	                fs = true; 
	            }else if(fs){
	                answer += "0";
	            }
	        }
        
  
        
        return answer;
    }
}
