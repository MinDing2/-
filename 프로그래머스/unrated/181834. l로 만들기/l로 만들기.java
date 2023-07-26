class Solution {
    public String solution(String myString) {
        char[] answer = new char[myString.length()];
		for (int i = 0; i < answer.length; i++) {
			if(108 > myString.charAt(i)) {
			    answer[i] = 'l';
			}else {
				answer[i] = myString.charAt(i);
			}
		}
		String answer1 = new String(answer);
        
	    return answer1;
    }
}