import java.util.*;
class Solution {
    public  ArrayList<String> solution(String my_string) {
        ArrayList<String> answer =new ArrayList<>();
		String str ="";
	
		for (int i = 0; i < my_string.length(); i++) {
			for (int j = i; j < my_string.length(); j++) {
				str += my_string.charAt(j);
			}
			answer.add(str);
			str ="";
		} 
        
		Collections.sort(answer);
        
        return answer;
    }
}