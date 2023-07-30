class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
		int key = 0;
        int cnt = 0;
		int start = myString.length() - pat.length();
		
		for (int i = 0; i < myString.length() - pat.length() + 1 ; i++) { 
			for (int j = start - i; j < myString.length() - i ; j++) { 
				answer += myString.charAt(j);
               if(answer.equals(pat) && cnt == 0)
                {
				    key = i;
                    cnt++; //한번만 ㅡ-ㅡ
			    }
			}		
			answer ="";
		}
	
		for (int i = 0; i <  myString.length() - key; i++) {
			answer += myString.charAt(i);
		}
        
        return answer;
    }
}