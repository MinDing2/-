import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        	
		String answer = "";
		boolean a = true;
	    Arrays.sort(indices);
	    
	    for (int i = 0; i < my_string.length(); i++) { 
	    	for (int j = 0; j < indices.length; j++) {
	    		if(indices[j] == i) {
	    			a = false;
	    		}
	    	}	
	    	if(a){
	    		answer += my_string.charAt(i);
	    	}
	    	a = true;
		}
	   
        
        return answer;
    }
}