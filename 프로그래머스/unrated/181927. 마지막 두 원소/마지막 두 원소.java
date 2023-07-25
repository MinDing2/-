class Solution {
    public int[] solution(int[] num_list) {
        
        int a = 0; 
        int[] answer = new int[num_list.length + 1];
        
        for(int i = 0; i < num_list.length; i++) {
	    	 answer[i] = num_list[i]; 
	     }
        
	    if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
        
	         a = num_list[num_list.length - 1] - num_list[num_list.length - 2];
             answer[num_list.length] = a;
        
	        return answer;  
	        }
	    else{
	       a = num_list[num_list.length - 1] * 2;
	       answer[num_list.length] = a;
    
         	return answer;      
	    }
    
    }
}