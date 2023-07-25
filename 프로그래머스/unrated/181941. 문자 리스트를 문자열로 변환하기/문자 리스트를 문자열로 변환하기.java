import java.util.Arrays; 
class Solution {
    public String solution(String[] arr) {
         /*
         String answer =  "";
         for(int i = 0; i < arr.length; i++){
             answer += arr[i];
         }
         */
   
		String answer =  Arrays.toString(arr);
	       
		 answer = answer.replaceAll(",","");
		 answer = answer.replaceAll("\\[","");
		 answer = answer.replaceAll("\\]","");
		 answer = answer.replaceAll(" ","");
	
	     return answer; 
        
        
    }
}