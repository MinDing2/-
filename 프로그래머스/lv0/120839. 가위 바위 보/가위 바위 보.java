class Solution {
    public String solution(String rsp) {
         
		   
		   char[] target = new char[rsp.length()];
	        
	        String answer = "";
	        for(int i = 0; i < rsp.length(); i++){
	             target[i] = rsp.charAt(i) ;
	      
	               if(target[i] == '2'){
	                   target[i] = '0';
	               }
	               else if(target[i] == '5'){
	                   target[i] = '2';
	               }
	               else{
	                   target[i] = '5'; 
	               }
	        }

	      answer = new String(target);
	         
	      return answer;
    }
}