import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        	String[] answer = new String[picture.length];
		    String[] answer1 = new String[picture.length * k];
	        Arrays.fill(answer,"");
	        Arrays.fill(answer1,"");
	        
	  
	        for(int i = 0; i < picture.length; i++){
	    	    for(int j = 0; j < picture[0].length(); j++){//가로 확대  
	    	 	    for(int l = 0; l < k; l++) {
	    	  		    answer[i] += picture[i].charAt(j);
	    		    }
	              }
	           }
        
	       for(int i = 0; i < picture.length; i++){
	          for(int j = 0; j < k; j++){//세로 확대 
	                 answer1[j + (i * k) ] = answer[i]; 
	           }
	       }
	 
         return answer1;
    }
}