class Solution {
    public int[] solution(int[] num_list) {
        
        int a = 0; 
	
	if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
		int[] answer = new int[num_list.length + 1];
	    a = num_list[num_list.length - 1] - num_list[num_list.length - 2];
	    
	    for(int i = 0; i < num_list.length; i++) {
	    	answer[i] = num_list[i]; 
	    }
        answer[num_list.length] = a;
	    return answer;  
	  
	}
	else{
		int[] answer = new int[num_list.length + 1];
	    a = num_list[num_list.length - 1] * 2;
	    
	    for(int i = 0; i < num_list.length; i++) {
	    	answer[i] = num_list[i]; 
	    }
	    answer[num_list.length] = a;
        
    	return answer;      
	}
        
  
        
    }
}