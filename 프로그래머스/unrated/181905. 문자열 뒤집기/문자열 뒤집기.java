class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
		
		for (int i = s; i <= e; i++) {
			answer += my_string.charAt(i);
		}
		
		StringBuilder input1 = new StringBuilder();
		input1.append(answer);
		input1.reverse();
		
		answer ="";
		
		for (int i = 0; i < s; i++) {
			answer += my_string.charAt(i);			
		}
		
		answer += input1; 
	
		for (int i = e + 1; i < my_string.length(); i++) {
			answer +=  my_string.charAt(i);
		}
        return answer;
    }
}