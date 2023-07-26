class Solution {
    public String[] solution(String[] strArr) {
          String[] answer = new String[strArr.length];
		    
		    	for (int i = 0; i < strArr.length; i++) {
		    		answer[i] = "";
		    		
		    		for (int j = 0; j < strArr[i].length(); j++) {
						if((i + 1) % 2 == 1 && strArr[i].charAt(j) < 97) {//홀수 -> 대문자 -> 소문자   +32
						    answer[i]	+= (char)(strArr[i].charAt(j) + 32);
						}else if ((i + 1) % 2 == 0 && strArr[i].charAt(j) > 96) {//소문자 -> 대문자 -32
							 answer[i]	+= (char)(strArr[i].charAt(j) - 32);							
						}else {
							answer[i]	+= strArr[i].charAt(j);
						}
		    		}	
		    }
		    	
		
				return answer;
    }
}