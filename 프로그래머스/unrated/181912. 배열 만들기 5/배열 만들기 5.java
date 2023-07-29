import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
		List<Integer> answer = new ArrayList<>();
		String str = ""; 
	
		for (int i = 0; i < intStrs.length; i++) {
			for (int j = s; j < s + l; j++) {
				str += intStrs[i].charAt(j);
			}
			if(Integer.parseInt(str) > k){
			  answer.add(Integer.parseInt(str));
			}
			str = "";
		}
                
        return answer;
    }
}