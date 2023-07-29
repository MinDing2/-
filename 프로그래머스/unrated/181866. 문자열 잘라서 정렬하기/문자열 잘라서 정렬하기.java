import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String str ="";
		int cnt = 0;
        int check = 0;
		for (int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i) != 'x') {
				str +=myString.charAt(i);
                check = 0;
			}else{
                if(check == 0) {
			    	str += " ";
				}                    
				cnt++;
                check++;
			}
          	if(myString.charAt(myString.length() - 1) != ' ') {
				cnt++;
			}
		}
        
        str = str.trim();
     
		String[] answer = new String[cnt];
	  
        answer = str.split(" ", cnt); 
       
        Arrays.sort(answer);
        
        return answer;
    }
}